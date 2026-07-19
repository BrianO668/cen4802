package com.brian.assignment1.controller;

public class FiboResponse {
    private int term;
    private int value;
    private boolean isPrime;

    public FiboResponse(int term, int value, boolean isPrime) {
        this.term = term;
        this.value = value;
        this.isPrime = isPrime;
    }

    public int getTerm() {
        return term;
    }

    public int getValue() {
        return value;
    }

    public boolean isPrime() {
        return isPrime;
    }
}
