package com.kaitan.foundamentals.structure;

public class Demo17 {
    public static void main(String[] args) {
        int nrow = 5;
        for (int line=1; line<=nrow; line++ ){
            for (int col =1; col<=nrow-line;col++){
                System.out.print(" ");
            }
            for (int c =1; c<=2*line-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
