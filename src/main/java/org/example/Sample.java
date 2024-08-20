package org.example;

import java.util.Date;

public class Sample {
    private String sampleID;
    private String sampleType;
    private Date collectionDate;

    public Sample(String sampleID, String sampleType, Date collectionDate) {
        this.sampleID = sampleID;
        this.sampleType = sampleType;
        this.collectionDate = collectionDate;
    }

    public boolean validateSample() {
        // Implement sample validation logic
        return true;
    }

    public void storeSample() {
        // Implement sample storage logic
    }

    // Getters

    public String getSampleID() {
        return sampleID;
    }

    public String getSampleType() {
        return sampleType;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }
}

