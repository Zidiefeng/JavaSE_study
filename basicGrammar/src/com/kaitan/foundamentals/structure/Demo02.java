package com.kaitan.foundamentals.structure;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        // score > 60, pass, else, fail
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter score:");
        int score = scanner.nextInt();
        if (score >=60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

