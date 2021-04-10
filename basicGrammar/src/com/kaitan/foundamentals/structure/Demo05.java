package com.kaitan.foundamentals.structure;

public class Demo05 {
    public static void main(String[] args) {
        String name = "Kaitan";

        switch (name){
            // JDK new feature support String

            case "Kaitan":
                System.out.println("Chinese");
                break; //如果不写这个break，入宫grade =A（符合当前这个case条件），
            // 仍会输出后面选项的内容，这个成为 case 穿透
            case "Jessy":
                System.out.println("English name");
                break;
            default: // 类似else
                System.out.println("Unknown");

        }

    }
}
