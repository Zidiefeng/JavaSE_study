package com.kaitan.foundamentals.structure;

public class Demo07 {
    public static void main(String[] args) {
        int sum = 0;
        int i=0;

        do {
            sum+=i;
            i++;
        }while (i<=100);

        System.out.println(sum);
    }
}
