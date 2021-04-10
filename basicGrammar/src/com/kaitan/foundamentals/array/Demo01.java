package com.kaitan.foundamentals.array;

public class Demo01 {
    public static void main(String[] args) {
        //var_type var_name = var_value;
        // array type (all elements have the same data type)

        int[] nums; // def var "nums", array of int
        int nums2[]; // not recommended but work as well, [] after var name

        nums = new int[10];

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

        //sum of array
        int sum=0;

        for (int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        System.out.println("sum "+sum);

        //System.out.println(nums[10]);
    }
}


