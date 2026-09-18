package com.harkirat;

import java.util.Arrays;

public class CartSubtotalCalculator {

    public static long subtotalCalculator(int[] a) {
        long t = 0;
        if (a != null) {
            for (int temp : a) {
                if (temp > -1) {
                    t = temp + t;
                } else {
                    throw new IllegalArgumentException("Invalid price = " + temp);
                }
            }
        } else {
            throw new IllegalArgumentException("Array is null " + Arrays.toString(a));
        }
        return t;
    }
}
