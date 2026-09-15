package com.harkirat;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.harkirat.CartSubtotalCalculator.subtotalCalculator;
import static com.harkirat.CartSubtotalCalculator.totalPrice;

public class CartSubtotalCalculatorTest {

//    static void main(String[] args) {
//        System.out.println(subtotalCalculator(totalPrice));
//        System.out.println(subtotalCalculator(emptyArray));
//        System.out.println(subtotalCalculator(largeNumber));
//        System.out.println(subtotalCalculator(singlePrice));
//        System.out.println(subtotalCalculator(addZero));
//        System.out.println(subtotalCalculator(inputChecking));
//        System.out.println(subtotalCalculator(repeatCallArr));
//        System.out.println(subtotalCalculator(negativePrice));
//        System.out.println(subtotalCalculator(nullArray));
//    }
    @Test
    public void totalPriceCalculatorTest() {
        Assert.assertEquals(subtotalCalculator(totalPrice), 5000);
    }
}
