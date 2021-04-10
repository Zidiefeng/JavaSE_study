package com.kaitan.foundamentals.basics;

public class Demo02 {
    //8 basic data types
    public static void main(String[] args) {
        //--------------must assign right value
        // String a;  ---wrong, must assign a value
        //String a= 10; ---wrong, 10 is int, not string
        String a="10"; //---right
        int b = 10; //---right
        System.out.println(a);

        //--------------8 data type
        //------4 format for integer
        int num1 = 10; //most common
        byte num2 = 20;//byte num2 = 200; ---wrong, out of range
        short num3 = 30;
        long num4 = 30L; // add "L" to indicate it's long

        //------2 float type
        float num5 = 50.1F; // add "F" to indicate it's float instead of double
        double num6 = 3.141592653580903237552524;

        //------1 string type
        char name = 'A'; //char name = 'Ab'; ---wrong, should be one character
        String name1 = "aosdal"; // String is not key word, it's not a basic type, but a class

        //------boolean
        boolean flag1 = true;
        boolean flag2 = false;
    }
}