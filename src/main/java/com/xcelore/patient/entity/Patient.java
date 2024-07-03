package com.xcelore.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name can't be blank")
    @Size(min = 3, message = "Name should be at least 3 characters")
    private String name;

    @NotBlank(message = "City can't be blank")
    @Size(max = 20, message = "City should be at max 20 characters")
    private String city;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone number can't be blank")
    @Size(min = 10, message = "Phone number should be at least 10 characters")
    private String phoneNumber;

    @NotBlank(message = "Symptom can't be blank")
    private String symptom;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Patient(Long id, String name, String city, String email, String phoneNumber, String symptom) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.symptom = symptom;
    }

    public Patient() {
        super();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", symptom='" + symptom + '\'' +
                '}';
    }
}
