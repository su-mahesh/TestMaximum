package com.bridgelabz;

public class TestMaximum <E extends Comparable<E>>{

    E[] input;

    @SafeVarargs
    public TestMaximum(E... input) {
        this.input = input;
    }

    public void sortInput() {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j].compareTo(input[j+1]) < 0) {
                    E temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }

    public void printMax(E input){

        System.out.println("Maximum input :"+input);

    }
    public E testMaximum() {

        sortInput();
        printMax(input[0]);
        return input[0];
    }
}
