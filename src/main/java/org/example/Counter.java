package org.example;

import java.util.Date;
import java.util.UUID;

public class Counter extends Person {
    private String counterID;

    public Counter(String name, int age, String gender, String dni, String address, String phone, String counterID) {
        super(name, age, gender, dni, address, phone);
        this.counterID = counterID;
    }

    // Getters

    public String getCounterId() {
        return counterID;
    }

    @Override
    public String getInfo() {
        return "Counter: " + name + ", Counter DNI: " + dni;
    }

    public String getName() {
        return name;
    }

    static Counter jheferRuiton = new Counter(
        "Jhefer Ruiton",
        25,
        "Male",
        "74172085",
        "Calle H 123",
        "987872192",
        UUID.randomUUID().toString()
    );

}
