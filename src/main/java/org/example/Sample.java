package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sample {
    private String sampleID;
    private String sampleType;
    private Date collectionDate;
    private Technician collectedBy;

    public Sample(String sampleID, String sampleType, Date collectionDate, Technician collectedBy) {
        this.sampleID = sampleID;
        this.sampleType = sampleType;
        this.collectionDate = collectionDate;
        this.collectedBy = collectedBy;
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

    static List<Sample> sampleList() {
        List<Sample> sampleList = new ArrayList<>();
        Sample sample1 = new Sample("sampleID1", "blood", new Date(), Technician.matiasCenteno);
        Sample sample2 = new Sample("sampleID2", "urine", new Date(), Technician.matiasCenteno);
        sampleList.add(sample1);
        sampleList.add(sample2);
        return sampleList;
    }
}

