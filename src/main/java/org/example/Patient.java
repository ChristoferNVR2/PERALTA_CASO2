package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Patient extends Person {
    private String patientID;

    public Patient(String name, int age, String gender, String dni, String address, String phone, String patientID) {
        super(name, age, gender, dni, address, phone);
        this.patientID = patientID;
    }


    @Override
    public String getInfo() {
        return "Patient: " + name + ", Patient DNI: " + dni;
    }

    // Getters

    public String getPatientID() {
        return patientID;
    }

    static Patient chrisVega = new Patient(
        "Chris Vega",
        18,
        "Male",
        "Calle A 123",
        "994199134",
        UUID.randomUUID().toString(),
        "74160675"
    );
}
