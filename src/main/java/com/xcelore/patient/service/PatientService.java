package com.xcelore.patient.service;

import com.xcelore.patient.entity.Patient;

import java.util.List;

public interface PatientService {
        Patient addPatient(Patient patient);
        void removePatient(Long id);
        Patient getPatientById(Long id);
        List<Patient> getAllPatients();
}
