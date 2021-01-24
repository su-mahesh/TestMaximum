package com.bridgelabz;

public class TestMaximum <E extends Comparable<E>>{

    E input1;
    E input2;
    E input3;

    @SafeVarargs
    public TestMaximum(E... input) {

        this.input1 = input[0];
        this.input2 = input[1];
        this.input3 = input[2];
    }

    public E testMaximum() {

        if(!(this.input1.compareTo(input2) <= 0) && input1.compareTo(input3) > 0)
            return input1;
        if(input2.compareTo(input3) > 0)
            return input2;
        return input3;
    }
}
