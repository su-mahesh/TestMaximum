package com.bridgelabz;

public class TestMaximum {

    public Integer testMaximum(Integer num1, Integer num2, Integer num3) {

        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        if(num2.compareTo(num3) > 0)
            return num2;
        return num3;
    }
}
