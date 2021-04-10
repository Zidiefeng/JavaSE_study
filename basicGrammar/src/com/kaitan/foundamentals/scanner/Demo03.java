package com.kaitan.foundamentals.scanner;
import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {

        //创建扫描器 对象, 类似python中的input（）
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入：");

        //System.out.println(scanner.hasNext()); //test
        //有则 通过next（）接收
        //String str = scanner.nextLine(); //程序等待输入
        //System.out.println("输入内容："+str);

        System.out.println(""+scanner.hasNext());
        System.out.println(""+scanner.next());


        //System.out.println("get it");

        //凡是IO，不关就会占用资源，之后要关掉
        scanner.close();
    }
}
