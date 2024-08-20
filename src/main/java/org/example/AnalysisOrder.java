package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnalysisOrder {
    private String orderID;
    private Date orderDate;
    private Doctor orderedBy;
    private List<AnalysisResult> analysisResultList;
    private Report report;

    public AnalysisOrder(String orderID, Date orderDate, Doctor orderedBy, List<AnalysisResult> analysisResultList, Report report) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderedBy = orderedBy;
        this.analysisResultList = analysisResultList;
        this.report = report;
    }

    public AnalysisOrder(String orderID, Date orderDate, List<AnalysisResult> analysisResultList, Report report) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.analysisResultList = analysisResultList;
        this.report = report;
    }

    public void addAnalysis(AnalysisResult analysis) {
        analysisResultList.add(analysis);
    }

    public double getTotalCost() {
        // Implement cost calculation logic
        return 0.0;
    }

    // Getters

    public String getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Doctor getOrderedBy() {
        return orderedBy;
    }

    public List<AnalysisResult> getAnalysisResultList() {
        return analysisResultList;
    }

    public void setAnalysisResultList(List<AnalysisResult> analysisResultList) {
        this.analysisResultList = analysisResultList;
    }

    static AnalysisOrder order1 = new AnalysisOrder(
        "orderID1",
        new Date(),
        Doctor.oswaldoMozo,
        AnalysisResult.analysisResultlist(),
        Report.report1
    );

}

