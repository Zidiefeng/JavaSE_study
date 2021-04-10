package com.kaitan.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "Luca";
        dog.age=3;
        dog.bark();
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}
