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


}

