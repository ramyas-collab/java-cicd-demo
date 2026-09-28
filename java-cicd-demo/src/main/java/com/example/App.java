package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Hello from GitHub Actions CI/CD!");
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("4 * 5 = " + calc.multiply(4, 5));
    }
}
