package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Calculator");
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 6));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(6, 3));
    }

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero!");
            }
            return a / b;
        }
    }
}
