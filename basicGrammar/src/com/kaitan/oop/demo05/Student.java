package com.kaitan.oop.demo05;

public class Student {
    private String name;
    private int id;
    private char sex;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    //alt + insert

    public void setAge(int age) {
        if (age>200|| age <0){
            this.age=3;
        } else {
            this.age = age;
        }

    }


    public int getAge() {
        return age;
    }
}
