package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sum() {
    Calculator calculator = new Calculator();
    float sum = calculator.sum(5,10);
        Assertions.assertEquals(15,sum);
    }
    @Test
    void dif() {
        Calculator calculator = new Calculator();
        float dif = calculator.dif(10,5);
        Assertions.assertEquals(5,dif);
    }
    @Test
    void prod() {
        Calculator calculator = new Calculator();
        float prod = calculator.prod(5,10);
        Assertions.assertEquals(50,prod);
    }
    @Test
    void div() {
        Calculator calculator = new Calculator();
        float div = calculator.div(50,10);
        Assertions.assertEquals(5,div);
    }

}
