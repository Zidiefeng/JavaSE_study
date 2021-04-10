package com.kaitan.oop.demo14;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.in();

        inner.getID();
    }
}
