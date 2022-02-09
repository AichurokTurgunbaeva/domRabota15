package com.company;

public class Main {

    public static void main(String[] args) {
	Person person = new Person("Adam","bashat");
        System.out.println(person);
    person.learn();


    Programmer programmer = new Programmer("Aichurok","techWoman","Google");
        System.out.println(programmer);
    programmer.eat();
    programmer.coding();


    Dancer dancer = new Dancer("Nargiza","KyrgyzBiyi","Eles");
        System.out.println(dancer);
    dancer.walk();
    dancer.dancing();


    Singer singer = new Singer("Dimash","Opera singer","Kazakh vocalists");
        System.out.println(singer);
    singer.playGuitar();
    singer.singing();







    }
}
