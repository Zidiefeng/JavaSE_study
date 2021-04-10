package com.kaitan.foundamentals.structure;

public class Demo11 {
    public static void main(String[] args) {
        //use wihle or for to output 1-1000
        for (int i = 0; i <=1000; i++){
            if (i%5==0){
                System.out.print(i+"\t"); //print: no /n in default
            }
            if (i%(5*3)==0){
                //System.out.print("\n");
                System.out.println(); //println: has /n in default (newline)
            }
        }
    }
}
