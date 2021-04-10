package com.kaitan.oop.demo11;

public class Bird {
    {
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public Bird(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Bird bird1 = new Bird();
        System.out.println("==============");
        Bird bird2 = new Bird();
        System.out.println("==============");
        Bird bird3 = new Bird();
    }

}

//        静态代码块
//        匿名代码块
//        Constructor
//        ==============
//        匿名代码块
//        Constructor
//        ==============
//        匿名代码块
//        Constructor
