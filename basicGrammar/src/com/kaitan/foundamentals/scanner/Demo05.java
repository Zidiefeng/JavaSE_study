package com.kaitan.foundamentals.scanner;

import java.security.Signature;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求sum，average，用回车确认输入，如果输入非数字，就结束

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int n = 0;

        while (scanner.hasNextDouble()){
            System.out.println("Please enter number");
            double x = scanner.nextDouble();
            n ++;
            sum +=x;
            System.out.println(n+" th data, current result is "+sum);
        }

        System.out.println(n + "sum is "+ sum);
        System.out.println(n + "average is " + (sum/n));
    }
}
