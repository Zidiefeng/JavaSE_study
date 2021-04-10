package com.kaitan.oop.demo02;

public class Application {
    public static void main(String[] args) {
        Student xiaoning = new Student();
        Student xiaojun = new Student();
        System.out.println(xiaoning.name); //null

        xiaoning.name = "Xiao Ming";
        xiaojun.name="Xiao Jun";
        System.out.println(xiaoning.name);//Xiao Ming
    }
}
