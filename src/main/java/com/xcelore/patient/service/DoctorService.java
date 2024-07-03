package com.xcelore.patient.service;

import com.xcelore.patient.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    void removeDoctor(Long id);
    List<Doctor> getDoctorsByCityAndSpeciality(String city, String speciality);
}
