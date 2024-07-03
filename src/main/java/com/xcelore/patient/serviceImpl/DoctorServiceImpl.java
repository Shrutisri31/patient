package com.xcelore.patient.serviceImpl;

import com.xcelore.patient.entity.Doctor;
import com.xcelore.patient.repository.DoctorRepository;
import com.xcelore.patient.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void removeDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public List<Doctor> getDoctorsByCityAndSpeciality(String city, String speciality) {
        return doctorRepository.findByCityAndSpeciality(city, speciality);
    }
}
