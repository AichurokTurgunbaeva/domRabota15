package com.company;

public class Dancer extends Person{
    String groupName;
    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return (name+" "+designation+" "+groupName);
    }

    void dancing() {
        System.out.println(name+" is dancing.");
    }
}
