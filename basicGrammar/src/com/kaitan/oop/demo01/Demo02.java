package com.kaitan.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {
        //static
        Student1.say();

        // non-static: need to initiate the class
        Student1 student = new Student1();
        student.talk();
        student.say();
    }

//    // with class
//    public void static a(){
//        b();
//    }
//
//    // with instantiation of class
//    public void b(){
//    }
}
