package com.harkirat;

public class CartSubtotalCalculator {
    static int [] totalPrice = {1999, 2500, 501};
    static int [] negativePrice = {500, -1};
    static int [] singlePrice = {1999};
    static int [] addZero = {0, 500};
    static int [] largeNumber = {2000000000, 2000000000};
    static int [] inputChecking = {100, 101, 200};
    static int [] repeatCallArr = {100, 101, 200};
    static int [] emptyArray = {};



    public static void main (String [] args){
        System.out.println(subtotalCalculator(totalPrice));
        System.out.println(subtotalCalculator(emptyArray));
        System.out.println(subtotalCalculator(largeNumber));
        System.out.println(subtotalCalculator(negativePrice));
    }

    public static long subtotalCalculator(int [] a) {
        long t=0;
        for (int temp:a) {
            if(temp >-1){
                t = temp + t;
            }
        else{
                throw new IllegalArgumentException ("Invalid price = " + temp);
            }
        }
        return t;
    }
}
