package com.kaitan.foundamentals.array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] a = {42,13,15,21,44,412,2};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] array){
        for (int i=0; i<array.length-1; i++){
            boolean flag = false;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j+1]>array[j]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
}
