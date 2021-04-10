package com.kaitan.foundamentals.structure;

public class Demo13 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50}; // 定义数组
        for (int x:numbers){
            System.out.println(x);
        }

        // compare with for
        System.out.println("================");
        for (int i = 0; i<5;i++){
            System.out.println(numbers[i]);
        }
    }
}
