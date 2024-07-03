package com.xcelore.patient.controller;

import com.xcelore.patient.entity.Doctor;
import com.xcelore.patient.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor) {
        return ResponseEntity.ok(doctorService.addDoctor(doctor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeDoctor(@PathVariable Long id) {
        doctorService.removeDoctor(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/suggest")
    public ResponseEntity<?> suggestDoctors(@RequestParam String city, @RequestParam String symptom) {
        // Get the speciality based on the symptom
        String speciality = getSpecialityBySymptom(symptom);
        // If the speciality cannot be determined (invalid symptom), return bad request
        if (speciality == null) {
            return ResponseEntity.badRequest().body("Invalid symptom provided");
        }
        // Retrieve doctors by city and speciality
        List<Doctor> doctors = doctorService.getDoctorsByCityAndSpeciality(city, speciality);
        // Check if no doctors are found
        if (doctors.isEmpty()) {
            // Case 1: No doctors in the location (outside Delhi, Noida, Faridabad)
            if (!city.equals("Delhi") && !city.equals("Noida") && !city.equals("Faridabad")) {
                return ResponseEntity.badRequest().body("We are still waiting to expand to your location");
            }
            // Case 2: No doctors for the symptom in that location
            return ResponseEntity.badRequest().body("There isn't any doctor present at your location for your symptom");
        }
        // Return the list of doctors found
        return ResponseEntity.ok(doctors);
    }



    private String getSpecialityBySymptom(String symptom) {
        switch (symptom) {
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopaedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "Skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT";
            default:
                return null;
        }
    }
}
