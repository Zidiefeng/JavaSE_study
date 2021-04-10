package com.kaitan.foundamentals.operator;

public class Demo01 {
    public static void main(String[] args) {
        //二元运算
        int a = 10; //control + D copy current line to next
        int b = 20;
        int c = 15;
        int d = 15;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //0 because 0.5 turned to int as defined
        System.out.println(a/(double)b); //0.5 as a solution
    }
}
