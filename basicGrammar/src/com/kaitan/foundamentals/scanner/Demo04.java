package com.kaitan.foundamentals.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;


        // integer input
        System.out.println("Please enter integer:");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("Interger" + i);
        } else {
            System.out.println("Not integer, try again!");
        }

        // float input
        System.out.println("Please enter float:");
        // !!!: hasNextFloat will not require re-enter

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("Float " + f);
        } else {
            System.out.println("Not float, try again!");
        }
        scanner.close();



    }
}
