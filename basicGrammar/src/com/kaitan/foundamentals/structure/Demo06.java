package com.kaitan.foundamentals.structure;

public class Demo06 {
    public static void main(String[] args) {
        // output 1-100
        int i=0;

        while (i<100){
            i++;
            System.out.println(i);
        }

        //sum of 1-100
        int sum = 0;
        i=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
