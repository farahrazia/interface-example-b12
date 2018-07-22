package com.company;

public class Dog {
    public String name;
    public String color;
   public Dog(){

   }
    public Dog(String name){
       this.name=name;

    }

    public Dog(String name,String color){
        this.name=name;
        this.color=color;


    }


    public void barking(String bark){
        System.out.println(name+ " goes like "+bark);
    }

    public void eating(String food){

        System.out.println(name+ " likes "+food);
}
}

