import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package com.example;


public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}