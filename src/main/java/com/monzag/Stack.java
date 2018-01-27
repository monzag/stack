package com.monzag;

public class Stack<T> {

    private int size;
    private T[] elements;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.top = -1;
    }
}
