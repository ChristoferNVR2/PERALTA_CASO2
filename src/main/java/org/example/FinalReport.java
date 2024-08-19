package org.example;

import java.util.Date;

public class FinalReport extends Report {
    private String conclusion;
    private Technician approvedBy;

    public FinalReport(String reportID, String reportData, Date creationDate, String conclusion, Technician approvedBy) {
        super(reportID, reportData, creationDate);
        this.conclusion = conclusion;
        this.approvedBy = approvedBy;
    }

    public void approveReport(Technician technician) {
        this.approvedBy = technician;
    }

    public String getFinalSummary() {
        return super.getReportSummary() + "\nConclusion: " + conclusion;
    }
}

