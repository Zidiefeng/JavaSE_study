package com.kaitan.foundamentals.array;

public class Demo08 {
    public static void main(String[] args) {
        // a new array:
        int[][] array1= new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        // print array1
        for (int i =0; i<array1.length;i++){
            for (int j =0; j<11; j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
/*      0	0	0	0	0	0	0	0	0	0	0
        0	0	1	0	0	0	0	0	0	0	0
        0	0	0	2	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0*/


        // number of good values
        int sum=0;
        for (int i =0; i<array1.length;i++){
            for (int j =0; j<11; j++){
                if(array1[i][j]!=0){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);

        //create sparse array2 from array1
        int[][] array2 = new int[sum+1][3];
        int[] firstCol= {11,11,sum};
        array2[0]=firstCol;
        int count=0;
        for (int i =0; i<array1.length;i++){
            for (int j =0; j<11; j++){
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }

        // print array2
        for (int i =0; i<array2.length;i++){
            for (int j =0; j<3; j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
/*      11	11	2
        1	2	1
        2	3	2*/



        // restore to the original array: array3
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }

        // print array3
        for (int i =0; i<array3.length;i++){
            for (int j =0; j<array3[i].length; j++){
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
/*      0	0	0	0	0	0	0	0	0	0	0
        0	0	1	0	0	0	0	0	0	0	0
        0	0	0	2	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0	0*/

    }
}
