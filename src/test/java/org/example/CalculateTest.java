package org.example;

import org.junit.jupiter.api.*;

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

    @Test
    void summaWithParameters_ShouldReturnSum_WhenCalled() {
        int expected = 30;
        int actual = calculate.summaWithParameters(10, 20);
        assertEquals(expected, actual, "Sum of 10 and 20 sshould be 30");
    }

    @Test
    void summaDouble_ShouldReturnSum_WhenCalled() {
        calculate.setOper1(10);
        calculate.setOper2(20);
        double expected = 30.33;
        double actual = calculate.summaDouble();
        assertEquals(expected, actual, 0.01, "SummaDoublew should be 30.33");
    }

    @Test
    void div_ShouldThrowArithmeticException_WhenOper2IsZero() {
        calculate.setOper1(10);
        calculate.setOper2(0);
        assertThrows(ArithmeticException.class, calculate::div, "Division by zero should throw ArithmeticException");
    }

    @Test
    void div_ShouldReturnDivisionResult_WhenCalled() throws ArithmeticException {
        calculate.setOper1(10);
        calculate.setOper2(2);
        int expected = 5;
        int actual = calculate.div();
        assertEquals(expected, actual, "Divisiona of 10 by 2 should be 5");
    }
}
