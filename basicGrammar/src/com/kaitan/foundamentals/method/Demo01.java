package com.kaitan.foundamentals.method;

public class Demo01 {
    // main method: let program run, not defined by us
    // void修饰符，是返回值类型，表示不返回，为空
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
    }

    //self defined
    //add method
    //如果不加static ,main funciton不能调用，要加static成为类变量
    // int修饰符是 返回值类型
    public static int add(int a, int b){
        return a+b;
    }

}
