package com.kaitan.foundamentals.structure;

public class Demo12 {
    public static void main(String[] args) {

        for (int line = 1; line<=9; line ++){
            for (int col=1; col<=line; col ++){
                System.out.print( col+"*"+line+"="+(line*col)+"\t");
            }
            System.out.println();
        }
    }
}
