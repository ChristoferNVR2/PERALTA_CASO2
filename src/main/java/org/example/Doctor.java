package org.example;

import java.util.Date;

public class Doctor extends Person {
    private final String specialization;
    private final String licenseNumber;

    public Doctor(String name, int age, String gender, String address, String phone, String specialization, String licenseNumber) {
        super(name, age, gender, address, phone);
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

    public void prescribeAnalysis(Patient patient) {
        System.out.println("Prescription for " + patient.getInfo());
    }

    @Override
    public String getInfo() {
        return "Doctor: " + name + ", Specialization: " + specialization;
    }
}
