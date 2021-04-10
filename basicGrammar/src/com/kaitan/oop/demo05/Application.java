package com.kaitan.oop.demo05;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = "";
        s1.setName("Jessy");
        System.out.println(s1.getName());

        s1.setAge(-2);
        System.out.println(s1.getAge());

    }
}
