package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAddition_AAA() {
        int a = 5, b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result, "5 + 3 should be 8");
    }

    @Test
    void testSubtraction_AAA() {
        int a = 10, b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result, "10 - 4 should be 6");
    }

    @Test
    void testMultiplication_AAA() {
        int a = 7, b = 6;
        int result = calculator.multiply(a, b);
        assertEquals(42, result, "7 * 6 should be 42");
    }
}
