package com.kaitan.foundamentals.basics;

public class Demo07 {
    //类里面还可以有属性 （变量）

    //实例变量,从属于对象
    String name;
    int age;


    //类变量：从属于类
    static double salary=2500;
    static final double PI =3.14; //常量 final
    final static double PI1 =3.14; //修饰符static 放前放后 都可以

    //main 方法
    public static void main(String[] args) {
        //局部变量
        int i=10;


        //实例变量的使用 演示
        //变量类型 变量名 = new com.kaitan.foundamentals.basics.Demo07();
        Demo07 demo07 = new Demo07();
        System.out.println(demo07.age); //0
        System.out.println(demo07.name); //null
        //此时如果run main（）， 虽然没有声明，但是仍然可以输出，输出的是其 default value


        //类变量 演示
        System.out.println(salary);
    }

    //类里面 还可以有其他方法
    public void add(){

    }
}
