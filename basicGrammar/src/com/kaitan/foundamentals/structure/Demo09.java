package com.kaitan.foundamentals.structure;

public class Demo09 {
    public static void main(String[] args) {
        int a = 1;//initial setting

        while(a<=100){
            System.out.println(a);
            a += 2;
        }
        System.out.println("End for while loop!");

        //initial, condition, update
        for (int i = 1; i<=100; i += 2){
            System.out.println(i);
        }
        System.out.println("End for for loop");


    }
}
