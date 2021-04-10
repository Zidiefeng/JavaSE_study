package com.kaitan.foundamentals.scanner;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        //创建扫描器 对象, 类似python中的input（）
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        //判断对方有没有输入string
        if (scanner.hasNext()){
            //有则 通过next（）接收
            String str = scanner.next(); //程序等待输入
            System.out.println("输入内容："+str);
        }

        //凡是IO，不关就会占用资源，之后要关掉
        scanner.close();
    }
}
