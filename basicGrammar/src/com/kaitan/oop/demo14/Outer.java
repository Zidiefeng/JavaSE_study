package com.kaitan.oop.demo14;

public class Outer {

    private int id = 32;

    public void out(){
        System.out.println("This is a outer method");
    }

    public class Inner{
        public void in(){
            System.out.println("This is a inner method");
        }

        public void getID(){
            System.out.println(id);
        }
    }
}
