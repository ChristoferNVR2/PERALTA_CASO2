package org.example;

import java.util.Date;

public class Technician extends Person {
    private String technicianID;
    private String department;

    public Technician(String name, int age, String gender, String address, String phone, String technicianID, String department) {
        super(name, age, gender, address, phone);
        this.technicianID = technicianID;
        this.department = department;
    }

    public AnalysisResult performAnalysis(Sample sample) {
        // Implement analysis logic
        return new AnalysisResult("Result ID", "Result Data", new Date());
    }

    public FinalReport generateAnalysisReport(Analysis analysis) {
        // Implement final report generation logic
        return new FinalReport("Final Report ID", "Final Report Data", new Date(), "Conclusion", this);
    }

    @Override
    public String getInfo() {
        return "Technician: " + name + ", Department: " + department;
    }
}
