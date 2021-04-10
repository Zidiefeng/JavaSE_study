package com.kaitan.foundamentals.method;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(10,20);
        System.out.println(max);
    }

    //compare
    public static int max(int num1, int num2){
        int result=0;
        if (num1>num2){
            result= num1;
        } else if(num1<num2){
            result=num2;
        } else{
            return 0; // finish method
        }
        return result;
    }
}
