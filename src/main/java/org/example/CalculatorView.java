package org.example;

import java.util.Scanner;

public class CalculatorView {
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    public double getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }
    public double menu() {
        System.out.println("Выберите операцию: ");
        System.out.println("Нажмите 1 для сложения");
        System.out.println("Нажмите 2 для вычитания");
        System.out.println("Нажмите 3 для умножения");
        System.out.println("Нажмите 4 для деления");
        System.out.println("Нажмите 5 для озведения в степень");
        System.out.println("Нажмите 6 для нахождения квадратного корня");
        return getUserInput();
    }

    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
}
