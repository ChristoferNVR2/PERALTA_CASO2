package org.example;

import java.util.Date;

public class Report {
    protected String reportID;
    protected String reportData;
    protected Date creationDate;

    public Report(String reportID, String reportData, Date creationDate) {
        this.reportID = reportID;
        this.reportData = reportData;
        this.creationDate = creationDate;
    }

    public String generateReport() {
        // Implement report generation logic
        return reportData;
    }

    public String getReportSummary() {
        // Implement report summary logic
        return "Summary: " + reportData;
    }

    // Getters

    public String getReportID() {
        return reportID;
    }

    public String getReportData() {
        return reportData;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}

