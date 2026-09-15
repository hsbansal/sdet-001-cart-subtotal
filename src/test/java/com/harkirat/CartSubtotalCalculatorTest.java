package com.harkirat;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.harkirat.CartSubtotalCalculator.subtotalCalculator;

public class CartSubtotalCalculatorTest {

    int[] totalPrice = {1999, 2500, 501};
    int[] negativePrice = {500, -1};
    int[] singlePrice = {1999};
    int[] addZero = {0, 500};
    int[] largeNumber = {2000000000, 2000000000};
    int[] inputChecking = {100, 101, 200};
    int[] repeatCallArr = {100, 101, 200};
    int[] emptyArray = {};
    int[] nullArray = null;

    @Test
    public void shouldReturnSumForMultipleValidPrices() {
        Assert.assertEquals(subtotalCalculator(totalPrice), 5000);
    }
}
