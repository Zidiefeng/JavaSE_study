package com.kaitan.foundamentals.operator;

public class Demo05 {
    public static void main(String[] args) {
        /*
        A=0011 1100
        B=0000 1101

        A&B 0000 1100 //每位  取 与
        A|B 0011 1101 //每位 取 或
        A^B 0011 0001 //相同 0， 不相同 1
        ~B 1111 0010 //取反

        2*8最快是什么 （2*2*2*2）
        //向左移1位<< 二进制，即 *2
        //向右移1位>> 二进制，即 /2
        0000 0000： 0
        0000 0001： 1
        0000 0010： 2
        0000 0011： 3
        */
        System.out.println(2<<3);


        //+= -= *= /=
        int a= 10;
        int b= 20;
        a+=b;
        System.out.println(a); //a = a+b

        //字符串连接符 +
        System.out.println(a+b);
        System.out.println(""+a+b); //3020 若+ 左右任意一项 String 时，会转为String  再连接
        System.out.println(a+b+"");//50


        //? :
        //x ? y : z
        //如果x == ture, 输出y 否则 z
        int score = 80;
        String result = score <60 ?"fail":"pass";
        System.out.println(result); //"pass"
    }
}
