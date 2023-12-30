package main.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму покупки: ");
        double purchaseSum = Double.parseDouble(scanner.nextLine());
        System.out.println("Ввдите размер скидки: ");
        double discountAmount = Integer.parseInt(scanner.nextLine());
        calculateDiscount((int) purchaseSum, (int) discountAmount);
        System.out.println("Сумма цены со скидкой: " + calculate(purchaseSum, discountAmount));
    }

    public static double calculate(double purchaseSum, double discountAmount) {
        double discountSum = purchaseSum * discountAmount / 100;
        return purchaseSum - discountSum;
    }
    public static int calculateDiscount(int purchaseAmount, int discountAmount) {
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше нуля");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может превышать 100");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100;
    }
}
