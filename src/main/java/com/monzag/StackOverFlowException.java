package com.monzag;

public class StackOverFlowException extends Exception {

    public StackOverFlowException() {
        super("Stack is full");
    }
}
