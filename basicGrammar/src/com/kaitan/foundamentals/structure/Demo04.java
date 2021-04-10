package com.kaitan.foundamentals.structure;

public class Demo04 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break; //如果不写这个break，入宫grade =A（符合当前这个case条件），
                        // 仍会输出后面选项的内容，这个成为 case 穿透
            case 'B':
                System.out.println("Good");
                break;
            case 'F':
                System.out.println("Bad");
                break;
            default: // 类似else
                System.out.println("Unknown level");

        }

    }
}
