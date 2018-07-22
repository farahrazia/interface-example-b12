package com.company;

public class Adele extends Human{
    @Override
    void walks() {
        System.out.println("walks slow");
    }

    @Override
    void runs() {
        System.out.println("runs fast");

    }

    @Override
    void eats() {
        System.out.println("she is foodie");

    }
}
