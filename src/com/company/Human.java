package com.company;

public abstract class Human {

    String name;
    int age;

    void lives(){
       System.out.println("lives in a society");

    }

    abstract void walks();
    abstract void runs();
    abstract void eats();
}
