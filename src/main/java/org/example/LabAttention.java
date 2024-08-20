package org.example;

import java.util.Date;

public class LabAttention {
    private String attentionID;
    private Date date;
    private AnalysisOrder order;
    private Counter counter;

    public LabAttention(String attentionID, Date date, AnalysisOrder order, Counter counter) {
        this.attentionID = attentionID;
        this.date = date;
        this.order = order;
        this.counter = counter;
    }


    public void scheduleAnalysis(Patient patient, AnalysisOrder order) {
        // Implement scheduling logic
    }

    public void attendPatient(Patient patient) {
        // Implement patient attention logic
    }

    // Getters

    public String getAttentionID() {
        return attentionID;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "LabAttention:" +
                "\nAttentionID: " + attentionID +
                "\nDate: " + date +
                "\nOrder: " + order.getOrderID() +
                "\nCounter: " + counter.getName();
    }

    static LabAttention attention1 = new LabAttention("attentionID1", new Date(), AnalysisOrder.order1, Counter.jheferRuiton);
}
