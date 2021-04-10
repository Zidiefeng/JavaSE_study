package com.kaitan.foundamentals.structure;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter: ");
        String s = scanner.nextLine();

        //equals 判断字符串是否相同
        if (s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("End");
    }
}
