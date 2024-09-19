package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateTest {

    private Calculate calculate;

    @BeforeEach
    void initCalculate() {
        calculate = new Calculate();
        System.out.println("Before Each called");
    }

    @AfterEach
    void clearCalculator() {
        calculate.setOper1(0);
        calculate.setOper2(0);
        System.out.println("After Each called");
    }

    @Test
    void summa_ShouldReturnSum_WhenCalled() {
        calculate.setOper1(10);
        calculate.setOper2(20);
        int expected = 30;
        int actual = calculate.summa();
        assertEquals(expected, actual, "Sum of 10 and 20 should be 30");
    }

    @Disabled
    @Test
    void firstTest() {
        assertEquals(4, 4, "First test should pass");
    }

    @Test
    void div_ShouldThrowArithmeticException_WhenOper2IsZero() {
        calculate.setOper1(10);
        calculate.setOper2(0);
        assertThrows(ArithmeticException.class, calculate::div, "Division by zero should throw ArithmeticException");
    }

    @Test
    void div_ShouldReturnDivisionResult_WhenCalled() {
        calculate.setOper1(10);
        calculate.setOper2(2);
        int expected = 5;
        int actual;
        try {
            actual = calculate.div();
        } catch (ArithmeticException e) {
            throw new RuntimeException("Unexpected ArithmeticException", e);
        }
        assertEquals(expected, actual, "Division of 10 by 2 should be 5");
    }
}
