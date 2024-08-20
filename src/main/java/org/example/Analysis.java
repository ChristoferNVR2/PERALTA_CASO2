package org.example;

import java.util.Date;

public class Analysis {
    private String type;
    private String name;

    public Analysis(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getDetails() {
        // Implement logic to get analysis details
        return "Details";
    };

    // Getters

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    static Analysis bloodCount = new Analysis("bloodTest", "Hemograma");
    static Analysis urea = new Analysis("urineTest", "Urea");
    static Analysis creatinine = new Analysis("urineTest", "Creatinina");
}
