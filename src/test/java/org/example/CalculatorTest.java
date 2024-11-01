package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class CalculatorTest implements Calculator {
    @Test
    void sum() {
        Assertions.assertEquals(15, Calculator.sum(5,10));
    }
    @Test
    void dif() {
        Assertions.assertEquals(5,Calculator.dif(10,5));
    }
    @Test
    void prod() {
        Assertions.assertEquals(50, Calculator.prod(5,10));
    }
    @Test
    void div() {

        Assertions.assertEquals(5,Calculator.div(50,10));
    }
    @Test
    void divByZero() {
        boolean exceptionThrown = false;

        try {
            Assertions.assertEquals(5,Calculator.div(50,0));
        }
        catch (ArithmeticException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

}
