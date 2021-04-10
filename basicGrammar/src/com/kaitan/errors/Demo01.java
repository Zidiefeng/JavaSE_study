package com.kaitan.errors;

public class Demo01 {
    public static void main(String[] args) {

    }

    public void a(){
        b();
    }

    public void b(){
        a();
    }

}
