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
        Float num1 = 754.5f, num2 = 534.6f, num3 = 234.42f;
        Float result = testMaximum.testMaxFloat(num1, num2, num3);
       Assert.assertEquals((Float)754.5f, result);
    }

    @Test
    public void givenMaxFloatAt_SecondPosition_shouldReturnSameNumber(){
        Float num1 = 754.5f, num2 = 5344.6f, num3 = 234.42f;
        Float result = testMaximum.testMaxFloat(num1, num2, num3);
        Assert.assertEquals(num2, result);
    }

    @Test
    public void givenMaxFloatAt_ThirdPosition_shouldReturnSameNumber(){
        Float num1 = 754.5f, num2 = 344.6f, num3 = 3234.42f;
        Float result = testMaximum.testMaxFloat(num1, num2, num3);
        Assert.assertEquals(num3, result);
    }

    @Test
    public void givenMaxStringAt_FirstPosition_shouldReturnSameString(){
        String result = testMaximum.testMaxString("zebra", "Lion", "Tiger");
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenMaxStringAt_SecondPosition_shouldReturnSameString(){
        String result = testMaximum.testMaxString("Zebra", "zebra", "Tiger");
        Assert.assertEquals("zebra", result);
    }

    @Test
    public void givenMaxStringAt_ThirdPosition_shouldReturnSameString(){
        String result = testMaximum.testMaxString("lion", "tiger", "zebra");
        Assert.assertEquals("zebra", result);
    }
}

