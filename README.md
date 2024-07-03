# Patient Management System

This project implements APIs for managing doctors and patients.

## Introduction

The Patient Management System provides backend APIs for registering doctors and patients, managing their information, and suggesting doctors based on patient symptoms.

## API Endpoints

### Add Doctor
- *POST* /doctors
  - Adds a new doctor to the database.

### Delete Doctor
- *DELETE* /doctors/{id}
  - Deletes the doctor with the specified ID from the database.

### Add Patient
- *POST* /patients
  - Registers a new patient with their symptoms.

### Delete Patient
- *DELETE* /patients/{id}
  - Removes the patient from the system.

### Get All Patients
- *GET* /patients
  - Retrieves a list of all registered patients.

### Suggest Doctors
- *GET* /doctors/suggest
  - Recommends doctors based on patient's city and symptom.

