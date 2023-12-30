package main.java;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90);
    }

    @Test
    public void testResult() {
        assertEquals(90.0, Calculator.calculateDiscount(100, 10), 0.0);
    }

    @Test
    public void testZeroResult() {
        assertThat(Calculator.calculateDiscount(0, 10)).isEqualTo(0);
    }

    @Test
    public void testZeroDiscount() {
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
    }

    @Test(expected = ArithmeticException.class)
    public void testDiscountLessThanZero() {
        Calculator.calculateDiscount(100, -5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDiscountMoreThan100() {
        Calculator.calculateDiscount(100, 110);
    }
}


