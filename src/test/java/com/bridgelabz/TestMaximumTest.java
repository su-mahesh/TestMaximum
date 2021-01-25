package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    @Test
    public void givenIntegerParameters_WhenMaxValueAtFirstPosition_shouldReturnMaxInteger(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 12, 23);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(34, result.intValue());
    }

    @Test
    public void givenIntegerParameters_WhenMaxValueAtSecondPosition_shouldReturnMaxInteger(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 87, 23);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(87, result.intValue());
    }

    @Test
    public void givenIntegerParameters_WhenMaxValueAtThirdPosition_shouldReturnMaxInteger(){
        TestMaximum<Integer> testMaximum = new TestMaximum<>(34, 67, 89);
        Integer result = testMaximum.getMaximum();
        Assert.assertEquals(89, result.intValue());
    }

    @Test
    public void givenFloatParameters_WhenMaxValueAtFirstPosition_shouldReturnMaxFloat(){
        Float num1 = 754.5f, num2 = 534.6f, num3 = 234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);

        Float result = testMaximum.getMaximum();
       Assert.assertEquals((Float)754.5f, result);
    }

    @Test
    public void givenFloatParameters_WhenMaxValueAtSecondPosition_shouldReturnMaxFloat(){
        Float num1 = 754.5f, num2 = 5344.6f, num3 = 234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);
        Float result = testMaximum.getMaximum();
        Assert.assertEquals(num2, result);
    }

    @Test
    public void givenFloatParameters_WhenMaxValueAtThirdPosition_shouldReturnMaxFloat(){
        Float num1 = 754.5f, num2 = 344.6f, num3 = 3234.42f;
        TestMaximum<Float> testMaximum = new TestMaximum<>(num1, num2, num3);
        Float result = testMaximum.getMaximum();
        Assert.assertEquals(num3, result);
    }

    @Test
    public void givenStringParameters_WhenMaxValueAtFirstPosition_shouldReturnMaxString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("zebra", "Lion", "Tiger");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenStringParameters_WhenMaxValueAtSecondPosition_shouldReturnMaxString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("Zebra", "zebra", "Tiger");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenStringParameters_WhenMaxValueAtThirdPosition_shouldReturnMaxString(){
        TestMaximum<String> testMaximum = new TestMaximum<>("lion", "tiger", "zebra");
        String result = testMaximum.getMaximum();
        Assert.assertEquals("zebra", result);
    }
}

