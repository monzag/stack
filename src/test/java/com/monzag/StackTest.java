package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void createStack() {
        this.stack = new Stack<>(3);
    }

    @Test
    void pushTooManyTest() throws StackOverFlowException {
        addDataToStack();
        assertThrows(StackOverFlowException.class, () -> stack.push(3));
    }

    @Test
    void pushTest() throws StackOverFlowException {
        addDataToStack();
        String expected = "0 1 2";
        assertEquals(expected, stack.toString());
    }

    @Test
    void popTest() throws StackUnderFlowException, StackOverFlowException {
        addDataToStack();
        Integer removed = stack.pop();
        Integer expected = 2;
        assertEquals(expected, removed);
    }

    @Test
    void popEmptyTest() throws StackUnderFlowException, StackOverFlowException {
        assertThrows(StackUnderFlowException.class, () -> stack.pop());
    }

    @Test
    void stackAfterPopTest() throws StackUnderFlowException, StackOverFlowException {
        addDataToStack();
        stack.pop();
        String expected = "0 1 null";
        assertEquals(expected, stack.toString());
    }

    @Test
    void peekTest() throws StackOverFlowException {
        addDataToStack();
        Integer expected = 2;
        assertEquals(expected, stack.peek());
    }

    @Test
    void sizeTest() throws StackOverFlowException {
        addDataToStack();
        int expected = 3;
        assertEquals(expected, stack.getSize());
    }

    private void addDataToStack() throws StackOverFlowException {
        for (Integer i = 0; i < 3; i++) {
            stack.push(i);
        }
    }

}