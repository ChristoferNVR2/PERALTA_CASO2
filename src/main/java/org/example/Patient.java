package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends Person {
    private String patientID;
    private List<String> medicalHistory;

    public Patient(String name, int age, String gender, String address, String phone, String patientID) {
        super(name, age, gender, address, phone);
        this.patientID = patientID;
        this.medicalHistory = new ArrayList<>();
    }

    public AnalysisOrder requestAnalysisOrder(Doctor doctor) {
        // Implement analysis order request logic
        return new AnalysisOrder("Order ID", new Date(), doctor, this);
    }

    public void viewReport(Report report) {
        // Implement logic to view report
        System.out.println(report.getReportSummary());
    }

    @Override
    public String getInfo() {
        return "Patient: " + name + ", Patient ID: " + patientID;
    }
}
