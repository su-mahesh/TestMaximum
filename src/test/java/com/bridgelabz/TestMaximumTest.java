package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    @Test
    public void givenMaxIntegerAt_FirstPosition_shouldReturnSameNumber(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 12, 23);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(34, result.intValue());
    }

    @Test
    public void givenMaxIntegerAt_SecondPosition_shouldReturnSameNumber(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 87, 23);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(87, result.intValue());
    }

    @Test
    public void givenMaxIntegerAt_ThirdPosition_shouldReturnSameNumber(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 67, 89);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(89, result.intValue());
    }

    @Test
    public void givenMaxFloatAt_FirstPosition_shouldReturnSameNumber(){
        Float num1 = 754.5f, num2 = 534.6f, num3 = 234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);

        Float result = testMaximum.getMaximum();
       Assert.assertEquals((Float)754.5f, result);
    }

    @Test
    public void givenMaxFloatAt_SecondPosition_shouldReturnSameNumber(){
        Float num1 = 754.5f, num2 = 5344.6f, num3 = 234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);
        Float result = testMaximum.getMaximum();
        Assert.assertEquals(num2, result);
    }

    @Test
    public void givenMaxFloatAt_ThirdPosition_shouldReturnSameNumber(){
        Float num1 = 754.5f, num2 = 344.6f, num3 = 3234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);
        Float result = testMaximum.getMaximum();
        Assert.assertEquals(num3, result);
    }

    @Test
    public void givenMaxStringAt_FirstPosition_shouldReturnSameString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("zebra", "Lion", "Tiger");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenMaxStringAt_SecondPosition_shouldReturnSameString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("Zebra", "zebra", "Tiger");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenMaxStringAt_ThirdPosition_shouldReturnSameString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("lion", "tiger", "zebra");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }
}

