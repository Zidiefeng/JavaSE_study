package com.kaitan.foundamentals.operator;

public class Demo04 {
    public static void main(String[] args) {
        //and or not
        boolean a= true;
        boolean b=false;
        System.out.println("a && b:"+(a&&b));
        System.out.println("a || b:"+(a||b));
        System.out.println("!b:"+(!b));

        //短路，看&&前面一项false时会不会执行后面一项，其实不会执行
        int c=5;
        boolean d= (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);
    }
}
