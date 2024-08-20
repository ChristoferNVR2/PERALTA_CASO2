package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinalReport {
    private List<Report> reportList;
    private Technician createdBy;

    public FinalReport(List<Report> reportList, Technician createdBy) {
        this.reportList = reportList;
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "FinalReport:" +
                "\nReport List: " + reportList +
                "\nCreated by: " + createdBy;
    }

    static FinalReport finalReport1 = new FinalReport(Report.analysisResultlist(), Technician.matiasCenteno);

}

