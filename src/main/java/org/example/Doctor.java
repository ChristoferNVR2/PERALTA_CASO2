package org.example;

import java.util.Date;
import java.util.UUID;

public class Doctor extends Person {
    private final String specialization;
    private final String licenseNumber;

    public Doctor(String name, int age, String gender, String dni, String address, String phone, String specialization, String licenseNumber) {
        super(name, age, gender, dni, address, phone);
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getInfo() {
        return "Doctor: " + name + ", DNI: " + dni + ", Specialization: " + specialization;
    }

    // Getters

    public String getSpecialization() {
        return specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    static Doctor oswaldoMozo = new Doctor(
        "Oswaldo Mozo",
        50,
        "Male",
        "70175087",
        "Calle D 123",
        "977596778",
        "Gastroenterologist",
        UUID.randomUUID().toString()
    );
}
