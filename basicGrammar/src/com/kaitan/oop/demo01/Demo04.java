package com.kaitan.oop.demo01;
//值傳遞
public class Demo04 {
    public static void main(String[] args) {
        int a =1;
        System.out.println(a);//1
        Demo04.change(a);
        System.out.println(a);//1
    }
    public static void change(int a){
        a =10;
    }
}