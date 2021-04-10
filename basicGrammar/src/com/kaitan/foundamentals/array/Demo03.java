package com.kaitan.foundamentals.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //print all elements
        for (int i = 0; i<arrays.length; i++){
            System.out.println(arrays[i]);
        }

        int sum =0;
        for (int i =0; i< arrays.length;i++){
            sum+=arrays[i];
        }
        System.out.println("=========");


        // calculate sum
        System.out.println("SUM "+sum);

        System.out.println("=========");

        //calculate max
        int max = arrays[0];
        for (int i = 1; i<arrays.length;i++){
            if (arrays[i]>max){
                max=arrays[i];
            }
        }
        System.out.println("MAX "+max);
    }
}
