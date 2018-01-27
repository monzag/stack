package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void createStack() {
        this.stack = new Stack(3);
    }


    private void addDataToStack() throws StackOverFlowException {
        for (Integer i = 0; i < 3; i++) {
            stack.push(i);
        }
    }

}