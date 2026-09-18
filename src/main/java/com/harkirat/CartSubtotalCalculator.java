package com.harkirat;

import java.util.Arrays;

public class CartSubtotalCalculator {

    public static long subtotalCalculator(int[] prices) {
        long subtotal = 0;
        
        if (prices != null) {
            for (int price : prices) {
                if (price >= 0) {
                    subtotal = price + subtotal;
                } else {
                    throw new IllegalArgumentException("Invalid price = " + price);
                }
            }
        } else {
            throw new IllegalArgumentException("Prices array must not be null");
        }
        return subtotal;
    }
}
