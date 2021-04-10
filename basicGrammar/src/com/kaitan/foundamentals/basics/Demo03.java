package com.kaitan.foundamentals.basics;

public class Demo03 {
    public static void main(String[] args) {
        //------整数拓展
        // 如何通过不同进制表示 整数，2进制，10进制，8进制，16进制
        int i1 = 10;
        int i2 = 010;//0开头 代表8进制
        int i3 = 0x10; //0x开头 16进制

        System.out.println(i1); //10，整数，10进制
        System.out.println(i2); //8， 8进制
        System.out.println(i3); //16， 16进制，因为数字不够16位，采用数字的0~9 和 字母的A~F 组合成为 16 位

        //------浮点 拓展
        // 银行的钱 如何表示
        //problem 1: float 和 double 的 0.1不相等
        float f = 0.1f; //0.1
        double d = 1.0/10; //0.1
        System.out.println(f==d); //false
        System.out.println(f);
        System.out.println(d);

        //problem 2： 浮点 较大的一个数 +1 之后 竟然等于他自己
        float d1 = 23131313131313f;
        float d2 = d1+1;
        System.out.println(d1==d2); //true

        /*解释：
        浮点数存在问题，因为能表现的小数 是 有限的， 有舍入误差（比如 无限小数 会被表示成离散的， 其实是 接近但不等于）
        ！！！最好不要用 浮点数 进行比较

        那如何表示 银行业务的小数呢？ 使用下面的类（不要用浮点数，不论是float, double 进行比较）
        BigDecimal
        */


        //------字符 拓展
        char c1 = 'a'; //必须是单引号表示
        char c2 = '中'; //中文也可以
        System.out.println(c1);
        System.out.println(c2);

        //可以 通过加 （int） 进行强制转换， 可以将 所有的 char 转换成数字
        System.out.println((int)c1); // 97
        System.out.println((int)c2); // 20013

        // 所有的字符本质 还是 数字
        /* char 涉及 编码问题
        有一个 编码 叫做 Unicode，可以处理各种语言的文字， 占两个字节，最多 可以表示65536个不同字符（2^16），（近期 甚至可以输出更多）
        （乱入：早期excel表 最长有2^16 = 65536 行）
        Unicode 有自己的编码表(每次去查这张表)， 比如97对应a， 65代表A （这个表里还有中文）
        Unicode 编码 一般可以通过转译表示，U000 UFFFF
         */

        char c3 = '\u0061'; // u代表用unicode 转译，就是unicode 的 表现方式，0061这个unicode编码就对应‘a’
        System.out.println(c3); //a

        //转义字符, 很多，下面是两个例子
        //System.out.println("Hello\tWorld"); // \t tab
        //System.out.println("Hello\nWorld"); // \n new line



        // ------ string 拓展
        // 这里就是抛出一个有意思的现象，
        // 这个之后会从 底层解释 （对象，内存）
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1==s2); //false

        String s3 = "hello world";
        String s4 = "hello world";
        System.out.println(s3==s4);//true


        // ------ boolean 拓展
        boolean flag=true;
        if (flag){} //与 if (flag==true){} 相同

    }
}
