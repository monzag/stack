package com.monzag;

import java.util.Arrays;

public class Stack<T> {

    private int size;
    private T[] elements;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T object) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        } else {
            elements[++top] = object;
        }
    }

    public String toString() {
        return Arrays.toString(elements).replaceAll("(^\\[|\\]$|,)", "");
    }
}
