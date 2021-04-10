package com.kaitan.oop.demo11;

public class Person {
    public void run(){
        go();
    }
    public static void go(){
        //run(); //error
    };

    public static void main(String[] args) {
        //run(); //没法调用，必须New
        //Person.run(); //error

        Person.go();
        go();
    }
}
