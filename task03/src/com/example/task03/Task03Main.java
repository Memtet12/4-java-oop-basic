package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, -2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        ComplexNumber sum = num1.Sum(num2);
        System.out.println("Sum: " + sum);

        ComplexNumber product = num1.Product(num2);
        System.out.println("Product: " + product);
    }
}

