package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnalysisOrder {
    private String orderID;
    private Date orderDate;
    private boolean isOrderedBy;
    private Doctor orderedBy;
    private Patient patient;
    private List<Analysis> analysisList;

    public AnalysisOrder(String orderID, Date orderDate, boolean isOrderedBy, Doctor orderedBy, Patient patient) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.isOrderedBy = isOrderedBy;
//        this.orderedBy = orderedBy;
        this.patient = patient;
        this.analysisList = new ArrayList<>();
    }

    public void addAnalysis(Analysis analysis) {
        analysisList.add(analysis);
    }

    public double getTotalCost() {
        // Implement cost calculation logic
        return 0.0;
    }

    public String getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Doctor getOrderedBy() {
        return orderedBy;
    }
}
