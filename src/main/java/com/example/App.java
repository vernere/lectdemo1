package com.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        Scanner input = new Scanner(System.in);
        if (logger != null) {

            logger.info("Enter first number: ");
            double num1 = input.nextDouble();
            logger.info("Enter second number: ");
            double num2 = input.nextDouble();

            logger.info("Choose operation (1: Add, 2: Subtract, 3: Multiply, 4: Divide): ");
            int operation = input.nextInt();
            double result = chooseOperation(operation, num1, num2, logger) ;

            logger.info(() -> String.format("The result is: %f", result));

            input.close();
        }

    }

    public static double addValues(double num1, double num2) {
        return num1 + num2;
    }

    public static double multiplyValues(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideValues(double num1, double num2) {
        return num1 / num2;
    }

    public static double subtractValues(double num1, double num2) {
        return num1 - num2;
    }

    public static double chooseOperation(int operation, double num1, double num2, Logger logger) {
        switch (operation) {
            case 1:
                return addValues(num1, num2);
            case 2:
                return subtractValues(num1, num2);
            case 3:
                return multiplyValues(num1, num2);
            case 4:
                return divideValues(num1, num2);
            default:
                logger.info("Invalid operation");
                return 0.0;
        }
    }
    
}
