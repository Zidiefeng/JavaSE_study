package com.kaitan.foundamentals.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a= 123123123123123L;
        int b =123;
        short c= 10;
        byte d= 8;

        System.out.println(a+b+c+d); //Long,如果有long就是long
        System.out.println(b+c+d); //Int，其他都是douhble
        System.out.println(c+d); //Int
        //System.out.println((String)(c+d)); //cannot cast 'int' to 'java.lang.String' (cast:转换)
        System.out.println((double)c+d); //有double就是double
    }
}
