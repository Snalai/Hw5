package org.example;

//Бизнесс логика.
public class CalculatorModel {
    private double result;

    public double getResult() {
        return result;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double degree(double num1, double num2) {
        return Math.pow(num1,num2);
    }
    public double cor(double num2) {
        return Math.sqrt(num2);
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return result = num1 / num2;
        } else {
            // Обработка деления на ноль
            return result = Double.NaN; // или можно выбросить исключение
        }

    }
}