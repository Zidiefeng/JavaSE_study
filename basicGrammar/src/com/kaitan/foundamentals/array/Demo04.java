package com.kaitan.foundamentals.array;

public class Demo04 {
    public static void main(String[] args) {
        int[] arrays= {1,2,3,4,5};

        printArray(arrays);
        int[] reversed = reverseArray(arrays);
        printArray(reversed);

    }


    // print all element
    public static void printArray(int[] arrays){
        for (int array : arrays) {
            System.out.println(array);
        }
    }


    //reverse array]
    public static int[] reverseArray(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0, j=result.length -1; i<arrays.length;i++, j--){
            result[j] = arrays[i];
        }
        return result;
    }
}
