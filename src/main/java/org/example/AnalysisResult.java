package org.example;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {
    private String resultID;
    private String resultData;
    private Date resultDate;
    private Analysis analysis;
    private List<Sample> samples;

    public AnalysisResult(String resultID, String resultData, Date resultDate, Analysis analysis, List<Sample> samples) {
        this.resultID = resultID;
        this.resultData = resultData;
        this.resultDate = resultDate;
        this.analysis = analysis;
        this.samples = samples;
    }

    public boolean isNormal() {
        // Implement logic to check if the result is normal
        return true;
    }

    // Getters

    public String getResultID() {
        return resultID;
    }

    public String getResultData() {
        return resultData;
    }

    public Date getResultDate() {
        return resultDate;
    }

    static List<AnalysisResult> analysisResultlist() {
        List<AnalysisResult> analysisResultList = new ArrayList<>();
        AnalysisResult result1 = new AnalysisResult("resultID1", "data", new Date(), Analysis.bloodCount, Sample.sampleList());
        analysisResultList.add(result1);
        return analysisResultList;
    }
}

