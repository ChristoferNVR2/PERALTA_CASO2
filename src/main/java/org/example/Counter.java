package org.example;

import java.util.Date;

public class Counter {
    private String counterID;
    private String location;

    public Counter(String counterID, String location) {
        this.counterID = counterID;
        this.location = location;
    }

    public void registerPatient(Patient patient) {
        // Implement patient registration logic
    }

    public boolean processPayment(Patient patient, AnalysisOrder order) {
        // Implement payment processing logic
        return true;
    }

    public LabAttention scheduleLabAttention(Patient patient, AnalysisOrder order) {
        // Implement lab attention scheduling logic
        return new LabAttention("Attention ID", order.getOrderDate());
    }

    public String getCounterId() {
        return counterID;
    }

    public String getLocation() {
        return location;
    }

}
