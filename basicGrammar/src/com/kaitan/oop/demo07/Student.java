package com.kaitan.oop.demo07;

public class Student extends Person{

    public Student() {
        super();
        System.out.println("Student constructor");
    }



    private String name = "Student Kaitan";
    public void test1(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print(){
        System.out.println("Student");
    }


    public void test2(){
        print();
        this.print();
        super.print();
    }

}
