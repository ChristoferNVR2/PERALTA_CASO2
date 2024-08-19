package org.example;

import java.util.Date;

public class LabAttention {
    private String attentionID;
    private Date date;

    public LabAttention(String attentionID, Date date) {
        this.attentionID = attentionID;
        this.date = date;
    }


    public void scheduleAnalysis(Patient patient, AnalysisOrder order) {
        // Implement scheduling logic
    }

    public void attendPatient(Patient patient) {
        // Implement patient attention logic
    }

    public String getAttentionID() {
        return attentionID;
    }

    public Date getDate() {
        return date;
    }
}
