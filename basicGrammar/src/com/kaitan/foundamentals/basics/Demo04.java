package com.kaitan.foundamentals.basics;

public class Demo04 {
    public static void main(String[] args) {
        // ------强制 转换 （高 -> 低）
        int i = 128;
        byte b = (byte)i; //强制转换： （type）var 的转换

        System.out.println(i);//128
        System.out.println(b);//-128， 因为byte范围到127，128就会内存溢出，变样子
        //输入Byte，control点击，进入类，能看到range

        // ------自动 （低 -> 高）
        int a = 128;
        double c = i;
        System.out.println(a);
        System.out.println(c);
        /*
        注意点：
        1. 不能对 boolean进行转换，因为boolean 是 位级别的
        2. 不能把对象类型（这些变量类型其实都是 对象） 转换为 不相干的类型
        3. 高容量 到 低容量 要强制转换
        4. 转换的时候可能出现 内存溢出，精度问题
         */

        // ------精度问题
        System.out.println((int)23.7); //23
        System.out.println((int)-45.89f); //45

        // ------ example
        char c1 = 'a';
        int d1 = c1+1;
        System.out.println(d1); //98
        System.out.println((char)d1); //b
    }
}
