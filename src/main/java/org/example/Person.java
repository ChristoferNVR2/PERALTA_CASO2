package org.example;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected String dni;
    protected String address;
    protected String phone;

    public Person(String name, int age, String gender, String dni, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dni = dni;
        this.address = address;
        this.phone = phone;
    }

    public abstract String getInfo();
}
