package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return (name+" "+designation);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    void learn() {
        System.out.println(name+" is learning.");
    }
    void walk() {
        System.out.println(name+" is walking.");
    }
    void eat() {
        System.out.println(name+ " is eating.");
    }
}
