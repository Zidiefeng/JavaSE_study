package com.kaitan.oop.demo10;

public class Application1 {
    public static void main(String[] args) {
        //父 高 - 子 低
        Person obj = new Student();// 这里 obj的 方法 随Person
        //obj.go(); //.go()是 Student 独有的方法，无法通过 obj调用

        Student obj1 = (Student) obj; //若想调用，可以将Person转成Student
        //（高转低，强制转换）
        obj1.go(); //这样就可以调用了

        ((Student) obj).go();


        Student student = new Student();
        Person person = student;

    }
}
