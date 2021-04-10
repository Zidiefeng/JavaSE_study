package com.kaitan.oop.demo10;

public class Application {
    public static void main(String[] args) {
        Object object = new Student();

        System.out.println(object instanceof Student); //现在是student, true
        System.out.println(object instanceof Person); //true
        System.out.println(object instanceof Object); //true
        System.out.println(object instanceof Teacher); //false
        System.out.println(object instanceof String); //false
        System.out.println("===============");

        Object object1 = new Object();

        System.out.println(object1 instanceof Student); //false
        System.out.println(object1 instanceof Person); //false
        System.out.println(object1 instanceof Object); //true
        System.out.println(object1 instanceof Teacher); //false
        System.out.println(object1 instanceof String); //false
        System.out.println("===============");

        Object object2 = new Person();

        System.out.println(object2 instanceof Student); //false
        System.out.println(object2 instanceof Person); //true
        System.out.println(object2 instanceof Object); //true
        System.out.println(object2 instanceof Teacher); //false
        System.out.println(object2 instanceof String); //false
        System.out.println("===============");

        Person person = new Person();

        System.out.println(person instanceof Student);//false
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错
        System.out.println("===============");

        Person person1 = new Student();

        System.out.println(person1 instanceof Student);//true
        System.out.println(person1 instanceof Person);//true
        System.out.println(person1 instanceof Object);//true
        System.out.println(person1 instanceof Teacher);//false
        //System.out.println(person1 instanceof String);//编译报错
        System.out.println("===============");

        Student student = new Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错
        System.out.println("===============");
    }
}
