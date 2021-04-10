package com.kaitan.oop.demo08;

public class Application {
    public static void main(String[] args){
        A a = new A();
        a.test(); //A -> test()

        B b = new A();
        b.test();

        B c = new B();
        c.test();

    }
}
