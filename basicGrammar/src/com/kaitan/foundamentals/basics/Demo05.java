package com.kaitan.foundamentals.basics;

public class Demo05 {
    public static void main(String[] args) {
        //------比较大的数字的时候，注意 溢出问题
        int money = 1000000000;
        int money1= 10_0000_0000; // JDK7 可以加_到数字中，不影响数字
        int years = 20;
        int total = money * years ;//-1474836480, 因为int到 20亿，内存溢出
        long total2 =money * years; //-1474836480, 因为自动转换之前，即int，已经发生问题了

        long total3 = money * ((long)years); //20000000000 比如把其中一个转成long，就全部自动转成long 进行计算了，
        System.out.println(total3);

        //小写l 也能表示long，但是 L不会跟1 混淆，用l！
    }
}

