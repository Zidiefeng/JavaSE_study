package com.kaitan.oop.demo01;

//引用傳遞: 對象
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null

        Demo05.change(person);
        System.out.println(person.name);//Jessy

    }

    public static void change(Person person){
        person.name = "Jessy";
    }
}

class Person{
    String name;

}
