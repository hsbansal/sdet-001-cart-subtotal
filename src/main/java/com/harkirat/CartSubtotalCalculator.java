package com.harkirat;

import java.util.Arrays;

public class CartSubtotalCalculator {

    public static long subtotalCalculator(int[] prices) {
        long subtotal = 0;
        if (prices != null) {
            for (int price : prices) {
                if (price > -1) {
                    subtotal = price + subtotal;
                } else {
                    throw new IllegalArgumentException("Invalid price = " + price);
                }
            }
        } else {
            throw new IllegalArgumentException("Array is null " + Arrays.toString(prices));
        }
        return subtotal;
    }
}
