package org.example;

public abstract class Analysis {
    protected String analysisID;
    protected String type;
    protected String status;

    public Analysis(String analysisID, String type, String status) {
        this.analysisID = analysisID;
        this.type = type;
        this.status = status;
    }

    public abstract AnalysisResult perform();
    public abstract String getDetails();
}
