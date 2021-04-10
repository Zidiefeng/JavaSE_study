package com.kaitan.oop.demo11;

public class Student {
    private static int age;
    private double score;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.score);

        //System.out.println(Student.score);
        System.out.println(Student.age);
    }
}
