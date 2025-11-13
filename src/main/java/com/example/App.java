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
            double value = 0;            
            switch (operation) {
                case 1:
                    value = addValues(num1, num2);
                    break;
                case 2:
                    value = subtractValues(num1, num2);
                    break;
                case 3:
                    value = multiplyValues(num1, num2);
                    break;
                case 4:
                    value = divideValues(num1, num2);
                    break;
                default:
                    logger.info("Invalid operation");
            }
            double result;
            result = value;
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
}
