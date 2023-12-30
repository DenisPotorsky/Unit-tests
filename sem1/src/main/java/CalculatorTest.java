package main.java;

import static main.java.Calculator.calculateDiscount;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculate(100, 25)).isEqualTo(75);

        try {
            System.out.println(calculateDiscount(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


