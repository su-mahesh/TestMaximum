package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    TestMaximum testMaximum = new TestMaximum();

    @Test
    public void givenMaxNumberAt_FirstPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaximum(34, 12, 23);
        Assert.assertEquals(34, result.intValue());
    }

    @Test
    public void givenMaxNumberAt_SecondPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaximum(34, 87, 23);
        Assert.assertEquals(87, result.intValue());
    }

    @Test
    public void givenMaxNumberAt_ThirdPosition_shouldReturnSameNumber(){
        Integer result = testMaximum.testMaximum(34, 67, 89);
        Assert.assertEquals(89, result.intValue());
    }
}

