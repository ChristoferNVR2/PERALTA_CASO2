package org.example;

import java.util.Date;

public class AnalysisResult {
    private String resultID;
    private String resultData;
    private Date resultDate;

    public AnalysisResult(String resultID, String resultData, Date resultDate) {
        this.resultID = resultID;
        this.resultData = resultData;
        this.resultDate = resultDate;
    }

    public String getResultData() {
        return resultData;
    }

    public boolean isNormal() {
        // Implement logic to check if the result is normal
        return true;
    }
}

