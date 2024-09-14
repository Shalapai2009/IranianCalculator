package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sum() {
    Calculator calculator = new Calculator();
    float sum = calculator.Sum(5,10);
        Assertions.assertEquals(15,sum);
    }

}
