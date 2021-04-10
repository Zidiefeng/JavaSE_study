package com.kaitan.oop.demo09;

public class Application {
    public static void main(String[] args) {
        //new Student();
        //new Person();

        Student s1 = new Student();
        Person s2 = new Student();
        //String s3 = new Student();
        Object s3 = new Student();

        s1.run();
        s2.run();

        ((Student) s2).eat();
    }
}
