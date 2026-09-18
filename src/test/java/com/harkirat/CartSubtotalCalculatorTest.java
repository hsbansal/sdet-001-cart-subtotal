package com.harkirat;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.harkirat.CartSubtotalCalculator.subtotalCalculator;

public class CartSubtotalCalculatorTest {


    @Test (groups = { "PositiveScenario" })
    public void shouldReturnSumForMultipleValidPrices() {
        int[] totalPrice = {1999, 2500, 501};
        Assert.assertEquals(subtotalCalculator(totalPrice), 5000L);
    }

    @Test (groups = {"NegativeScenarios"},expectedExceptions = IllegalArgumentException.class)
    public void shouldRejectNegativePrice() {
        int[] negativePrice = {500, -1};
        subtotalCalculator(negativePrice);
    }

    @Test(groups = {"NegativeScenarios"},expectedExceptions = IllegalArgumentException.class)
    public void shouldRejectNullArray(){
        int[] nullArray = null;
        subtotalCalculator(nullArray);
    }

    @Test(groups = { "PositiveScenario" })
    public void shouldReturnSingleItemPrice() {
        int[] singlePrice = {1999};
        Assert.assertEquals(subtotalCalculator(singlePrice),1999L);
    }

    @Test(groups = { "PositiveScenario" })
    public void shouldAcceptEmptyArray() {
        int[] emptyArray = {};
        Assert.assertEquals(subtotalCalculator(emptyArray),0L);
    }

    @Test (groups = { "PositiveScenario" })
    public void shouldAllowZeroPricedItems() {
        int[] addZero = {0, 500};
        Assert.assertEquals(subtotalCalculator(addZero), 500L);
    }

    @Test (groups = {"PositiveScenario"})

    public void shouldCalculateSubtotalBeyondIntRange() {
        int[] largeNumber = {2000000000, 2000000000};
        Assert.assertEquals(subtotalCalculator(largeNumber),4000000000L);
    }

    @Test (groups = {"PositiveScenario"})
    public void shouldNotModifyInputArray(){
        int[] repeatCallArr = {100, 101, 200};
        int[] savedCopy  = repeatCallArr.clone();
        subtotalCalculator(repeatCallArr );
        Assert.assertEquals(savedCopy , repeatCallArr, "The calculator must leave the input array unchanged");
    }

    @Test (groups = {"PositiveScenario"})
    public void shouldCalculateEachCallIndependently(){
        int[] inputChecking = {100, 101, 200};
        Assert.assertEquals(subtotalCalculator(inputChecking), 401L);
        Assert.assertEquals(subtotalCalculator(inputChecking), 401L);
    }

    @Test (groups = {"PositiveScenario"})
    public void shouldCountDuplicatePricesSeparately(){
        int[] repeatCallArr = {200, 200};
        Assert.assertEquals(subtotalCalculator(repeatCallArr), 400L);
    }
}
