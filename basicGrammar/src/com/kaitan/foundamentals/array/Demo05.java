package com.kaitan.foundamentals.array;

public class Demo05 {
    public static void main(String[] args) {
        int[][] array={{1,2},{2,3},{3,4},{4,5}};
        int[][][] array1={{{1}, {2}},{{2}, {3}},{{3}, {4}},{{4}, {5}}};
        /*
        1，2 array[0]
        2，3 array[1]
        3，4 array[2]
        4，5 array[3]
         */
        for (int i = 0;i<array.length;i++){
            for (int j =0; j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }
    }

}
