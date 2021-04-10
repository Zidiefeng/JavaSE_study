package com.kaitan.foundamentals.array;

public class Demo02 {
    public static void main(String[] args) {
        //static 初始化
        int[] a={1,2,3,4,5};
        System.out.println(a[0]);

        Demo01[] demo_array  = {new Demo01(), new Demo01()}; //引用類型

        // dynamic 初始化
        int[] nums = new int[10];

        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums[9]=10;
    }
}
