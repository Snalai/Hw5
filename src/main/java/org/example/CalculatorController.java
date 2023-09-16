package org.example;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel newModel, CalculatorView view) {
        model = newModel;
        this.view = view;
    }

    public void input() {

        double num1 = view.getUserInput();
        double operation = view.menu();
        double num2 = view.getUserInput();
        calculate(num1, num2, operation);
    }

    public void calculate(double num1, double num2, double operator) {
        double result;
        try {
            switch ((int) operator) {
                case 1:
                    result = model.add(num1, num2);
                    break;
                case 2:
                    result = model.subtract(num1, num2);
                    break;
                case 3:
                    result = model.multiply(num1, num2);
                    break;
                case 4:
                    result = model.divide(num1, num2);
                    break;
                case 5:
                    result = model.degree(num1, num2);
                    break;
                case 6:
                    result = model.cor(num2);
                    break;
                default:
                    view.printError("Неверная операция");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException e) {
            view.printError(e.getMessage());
            // calculate(num1, num2, operator); возможный пример повторного вызова функции
        }
    }
}
