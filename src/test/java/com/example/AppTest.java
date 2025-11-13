package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;



class AppTest {


    @Test
    void testAddValuesPositiveNumbers() {
        assertEquals(5.0, App.addValues(2.0, 3.0));
    }

    @Test
    void testAddValuesNegativeNumbers() {
        assertEquals(-5.0, App.addValues(-2.0, -3.0));
    }

    @Test
    void testAddValuesMixedNumbers() {
        assertEquals(1.0, App.addValues(-2.0, 3.0));
    }

    @Test
    void testAddValuesZero() {
        assertEquals(0.0, App.addValues(0.0, 0.0));
    }

    @Test
    void testAddValuesDecimalNumbers() {
        assertEquals(5.5, App.addValues(2.3, 3.2), 0.0001);
    }

    @Test
    void testAddValuesLargeNumbers() {
        assertEquals(2000000.0, App.addValues(1000000.0, 1000000.0));
    }

    @Test
    void testSubtractValuesPositiveNumbers() {
        assertEquals(1.0, App.subtractValues(5.0, 4.0));
    }

    @Test
    void testSubtractValuesNegativeNumbers() {
        assertEquals(-1.0, App.subtractValues(-5.0, -4.0));
    }

    @Test
    void testSubtractValuesMixedNumbers() {
        assertEquals(-7.0, App.subtractValues(-2.0, 5.0));
    }

    @Test
    void testSubtractValuesZero() {
        assertEquals(0.0, App.subtractValues(0.0, 0.0));
    }

    @Test
    void testSubtractValuesDecimalNumbers() {
        assertEquals(1.1, App.subtractValues(3.5, 2.4), 0.0001);
    }

    @Test
    void testMultiplyValuesPositiveNumbers() {
        assertEquals(15.0, App.multiplyValues(3.0, 5.0));
    }

    @Test
    void testMultiplyValuesNegativeNumbers() {
        assertEquals(15.0, App.multiplyValues(-3.0, -5.0));
    }

    @Test
    void testMultiplyValuesMixedNumbers() {
        assertEquals(-15.0, App.multiplyValues(-3.0, 5.0));
    }

    @Test
    void testMultiplyValuesZero() {
        assertEquals(0.0, App.multiplyValues(5.0, 0.0));
    }

    @Test
    void testMultiplyValuesDecimalNumbers() {
        assertEquals(7.36, App.multiplyValues(2.3, 3.2), 0.0001);
    }

    @Test
    void testDivideValuesPositiveNumbers() {
        assertEquals(2.0, App.divideValues(10.0, 5.0));
    }

    @Test
    void testDivideValuesNegativeNumbers() {
        assertEquals(2.0, App.divideValues(-10.0, -5.0));
    }

    @Test
    void testDivideValuesMixedNumbers() {
        assertEquals(-2.0, App.divideValues(-10.0, 5.0));
    }

    @Test
    void testDivideValuesDecimalNumbers() {
        assertEquals(2.5, App.divideValues(5.0, 2.0), 0.0001);
    }

    @Test
    void testDivideValuesByZero() {
        assertEquals(Double.POSITIVE_INFINITY, App.divideValues(10.0, 0.0));
    }

    @Test
    void testDivideValuesZeroByNumber() {
        assertEquals(0.0, App.divideValues(0.0, 5.0));
    }
 
}
