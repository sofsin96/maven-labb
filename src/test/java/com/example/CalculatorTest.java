package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test add method")
    void testAdd() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(2,2));
    }

    @Disabled
    @Test
    void testMultiply() {
        assertEquals(1, calculator.divide(2,2));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculator.divide(2,2));
    }

}