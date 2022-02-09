package com.company;

public class Singer extends Person{
    String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return (name+"  "+designation+"  "+bandName);
    }

    void singing() {
        System.out.println(name+" is singing.");
    }
    void playGuitar() {
        System.out.println(name+" is playing guitar.");
    }
}
