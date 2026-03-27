package com.example;

public class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Calculator Application");
        System.out.println("======================");
        
        double num1 = 15;
        double num2 = 5;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();
        
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}