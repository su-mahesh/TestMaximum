package com.bridgelabz;

public class TestMaximum {

    public Integer testMaxInteger(Integer num1, Integer num2, Integer num3) {

        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        if(num2.compareTo(num3) > 0)
            return num2;
        return num3;
    }

    public Float testMaxFloat(Float num1, Float num2, Float num3) {

        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        if(num2.compareTo(num3) > 0)
            return num2;
        return num3;
    }
}
