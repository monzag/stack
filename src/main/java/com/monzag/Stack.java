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

    public T pop() throws StackUnderFlowException {
        if (top < 1) {
            throw new StackUnderFlowException();
        }

        T removed = elements[top];
        elements[top] = null;
        top--;
        return removed;
    }

    public T peek() {
        return elements[top];
    }

    public int getSize() {
        return size;
    }

    public int getFreeSpace() {
        if (top > 0) {
            return (size - 1) - top;
        } else {
            return size;
        }
    }

    public String toString() {
        return Arrays.toString(elements).replaceAll("(^\\[|\\]$|,)", "");
    }
}
