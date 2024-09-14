package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp(){
    calculator = new Calculator();
    }

    @Test
    void sum() {
    float sum = calculator.sum(5,10);
        Assertions.assertEquals(15,sum);
    }
    @Test
    void dif() {
        float dif = calculator.dif(10,5);
        Assertions.assertEquals(5,dif);
    }
    @Test
    void prod() {
        float prod = calculator.prod(5,10);
        Assertions.assertEquals(50,prod);
    }
    @Test
    void div() {
        float div = calculator.div(50,10);
        Assertions.assertEquals(5,div);
        System.out.println(1);
    }

}
