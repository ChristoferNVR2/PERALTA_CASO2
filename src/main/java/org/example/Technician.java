package org.example;

import java.util.Date;
import java.util.UUID;

public class Technician extends Person {
    private String department;
    private String technicianID;
    private Department assignedDepartment;

    public Technician(String name, int age, String gender, String dni, String address, String phone, String department, String technicianID, Department assignedDepartment) {
        super(name, age, gender, dni, address, phone);
        this.department = department;
        this.technicianID = technicianID;
        this.assignedDepartment = assignedDepartment;
    }

    @Override
    public String getInfo() {
        return "Technician: " + name + ", DNI: " + dni + ", Department: " + department;
    }

    // Getters

    public String getDepartment() {
        return department;
    }

    public String getTechnicianID() {
        return technicianID;
    }

    static Technician matiasCenteno = new Technician(
        "Matias Centeno",
        30,
        "Male",
        "70018084",
        "Calle F 123",
        "987762192",
        "Laboratory",
        UUID.randomUUID().toString(),
        Department.laboratory
    );
}
