package com.kaitan.foundamentals.structure;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // score > 60, pass, else, fail
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter score:");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("S");
        }else if (score < 100 && score >=90){
            System.out.println("A");
        }else if (score<90 && score>=60){
            System.out.println("B");
        }else if(score<60 && score>=0) {
            System.out.println("Fail");
        }else {
            System.out.println("Wrong enter");
        }
    }
}
