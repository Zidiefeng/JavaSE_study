package com.kaitan.foundamentals.array;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] a={4,52,123,5,1,42};
        System.out.println(a);
        //[I@1b6d3586
        System.out.println(Arrays.toString(a));
        //[4, 52, 123, 5, 1, 42]
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //[1, 4, 5, 42, 52, 123]

        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
        //[0, 0, 0, 0, 0, 0]
    }
}
