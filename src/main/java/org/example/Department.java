package org.example;

public class Department {
    private String departmentID;
    private String name;

    public Department(String departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }

    public void assignTechnician(Technician technician) {
        // Implement technician assignment logic
    }

    public String getDepartmentDetails() {
        return "Department: " + name;
    }

    // Getters

    public String getDepartmentID() {
        return departmentID;
    }

    public String getName() {
        return name;
    }

    static Department laboratory = new Department("departmentID1", "Laboratory");
}
