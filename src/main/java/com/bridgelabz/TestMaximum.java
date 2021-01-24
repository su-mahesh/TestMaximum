package com.bridgelabz;

public class TestMaximum {

    public <E extends Comparable> E testMaximum(E input1, E input2, E input3) {

        if(!(input1.compareTo(input2) <= 0) && input1.compareTo(input3) > 0)
            return input1;
        if(input2.compareTo(input3) > 0)
            return input2;
        return input3;
    }
}
