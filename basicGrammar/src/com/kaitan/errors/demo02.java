package com.kaitan.errors;

public class demo02 {
    public static void main(String[] args) {

        int a =1;
        int b=0;

        try {
            System.out.println(a/b);
        }catch(Throwable e){
            System.out.println("程序出现异常，b不能为0");
        }finally {
            System.out.println("finally");
        }

    }
}
