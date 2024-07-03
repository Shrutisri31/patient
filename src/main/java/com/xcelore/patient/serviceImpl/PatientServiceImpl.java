package com.xcelore.patient.serviceImpl;

import com.xcelore.patient.entity.Patient;
import com.xcelore.patient.repository.PatientRepository;
import com.xcelore.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void removePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
    @Override
    public List<Patient> getAllPatients() { return patientRepository.findAll(); }
}
