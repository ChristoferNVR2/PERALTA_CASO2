package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Report {
    private String reportID;
    private Date creationDate;
    private Technician createdBy;

    public Report(String reportID, Date creationDate, Technician createdBy) {
        this.reportID = reportID;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
    }

    // Getters

    public String getReportID() {
        return reportID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    static List<Report> analysisResultlist() {
        List<Report> analysisResultList = new ArrayList<>();
        analysisResultList.add(report1);
        return analysisResultList;
    }

    static Report report1 = new Report("reportID1", new Date(), Technician.matiasCenteno);
}

