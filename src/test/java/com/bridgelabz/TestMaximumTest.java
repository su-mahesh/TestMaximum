package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    TestMaximum testMaximum = new TestMaximum();

    @Test
    public void givenMaxIntegerAt_FirstPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaxInteger(34, 12, 23);
        Assert.assertEquals(34, result.intValue());
    }

    @Test
    public void givenMaxIntegerAt_SecondPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaxInteger(34, 87, 23);
        Assert.assertEquals(87, result.intValue());
    }

    @Test
    public void givenMaxIntegerAt_ThirdPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaxInteger(34, 67, 89);
        Assert.assertEquals(89, result.intValue());
    }

    @Test
    public void givenMaxFloatAt_FirstPosition_shouldReturnSameNumber(){
        Float result = testMaximum.testMaxFloat(754.5f, 534.6f, 234.42f);
        Assert.assertEquals((Float)754.5f, result);
    }
}

