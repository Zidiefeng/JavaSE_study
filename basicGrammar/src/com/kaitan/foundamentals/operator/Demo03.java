package com.kaitan.foundamentals.operator;

public class Demo03 {
    public static void main(String[] args) {
        //%
        int s=10;
        int v=22;
        System.out.println(v%s); //2


        //++ --
        //难点！！ ++a表示先进性a=a+1,然后再对a进行相关运算， a++指先做前面的运算，然后再a=a+1
        int a = 3;
        int b = a++; //相当于 b=a, a=a+1, b=3
        System.out.println(a); //4
        int c = ++a; //相当于a = a+1, c=a, c=5

        System.out.println(a);//5
        System.out.println(a++); //5 print(a), a=a+1
        System.out.println(a); //6
        System.out.println(--a); //5 a=a-1, print(a)
        System.out.println(a); //5
        System.out.println(b); //3
        System.out.println(c); //5


        //幂运算，java里面没有2^3
        double pow=Math.pow(2,3);
        System.out.println(pow); //8.0
    }
}
