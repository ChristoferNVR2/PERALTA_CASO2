package org.example;

public class Department {
    private String departmentID;
    private String name;
    private String location;

    public Department(String departmentID, String name, String location) {
        this.departmentID = departmentID;
        this.name = name;
        this.location = location;
    }

    public void assignTechnician(Technician technician) {
        // Implement technician assignment logic
    }

    public String getDepartmentDetails() {
        return "Department: " + name + ", Location: " + location;
    }

    // Getters

    public String getDepartmentID() {
        return departmentID;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
