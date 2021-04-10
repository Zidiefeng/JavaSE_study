package com.kaitan.foundamentals.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        // demo04.test();
        demo04.test(1,3,2);
    }
    public void test(int ... i){
        for (int k=0; k<i.length; k++){
            System.out.println(i[k]);
        }

    }
}
