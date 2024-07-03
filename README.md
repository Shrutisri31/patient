# Patient Management System

This project implements APIs for managing doctors and patients.

## Introduction

The Patient Management System provides backend APIs for registering doctors and patients, managing their information, and suggesting doctors based on patient symptoms.

## API Endpoints

### Add Doctor
- *POST* /doctors
  - Adds a new doctor to the database.
    https://github.com/Shrutisri31/patient/blob/main/doctors_POST.jpeg?raw=true

### Validation on Adding Doctor
- *POST* /doctors
- Doesn't allow any blank field and take care of all validations
  https://github.com/Shrutisri31/patient/blob/main/doctors_validation_POST.jpeg?raw=true
  
### Suggest Doctors
- *GET* /doctors/suggest
  - Recommends doctors based on patient's city and symptom.
    https://github.com/Shrutisri31/patient/blob/main/doctors_GET(suggestion).jpeg?raw=true

## Egde case 1 (: If there isn’t any doctor on that location)
- *GET* /suggest?city=Mumbai&symptom=Othropedics
  https://github.com/Shrutisri31/patient/blob/main/EdgeCase1.jpeg?raw=true

## Egde case 2 (: : If there isn’t any doctor for that symptom on that location)
- *GET* /suggest??city=Delhi&symptom=Skin burn
  https://github.com/Shrutisri31/patient/blob/main/EdgeCase2.jpeg?raw=true
 

### Delete Doctor
- *DELETE* /doctors/{id}
  - Deletes the doctor with the specified ID from the database.
    https://github.com/Shrutisri31/patient/blob/main/doctors_delete.jpeg?raw=true

### Add Patient
- *POST* /patients
  - Registers a new patient with their symptoms.
    https://github.com/Shrutisri31/patient/blob/main/POST_patients.jpeg?raw=true

### Validation on Adding Patient
- *POST* /patients
- Doesn't allow any blank field and take care of all validations
  https://github.com/Shrutisri31/patient/blob/main/Patient_validation.png?raw=true

### Delete Patient
- *DELETE* /patients/{id}
  - Removes the patient from the system.
    https://github.com/Shrutisri31/patient/blob/main/patient_delete.jpeg?raw=true

### Get All Patients
- *GET* /patients
  - Retrieves a list of all registered patients.
    https://github.com/Shrutisri31/patient/blob/main/GET_all_patients.jpeg?raw=true

### Get Patients by id
- *GET* /patients/$(id)
  - Retrieves a list of all registered patients.
   https://github.com/Shrutisri31/patient/blob/main/GET_patients_by_id.jpeg?raw=true



