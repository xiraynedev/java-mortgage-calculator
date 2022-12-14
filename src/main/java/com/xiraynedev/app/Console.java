package com.xiraynedev.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
        private static final Scanner scanner = new Scanner(System.in);

        public static double getUserInput(String prompt, double min, double max) {
                double inputValue;
                while (true) {
                        System.out.println();
                        System.out.print(prompt);
                        try {
                                inputValue = scanner.nextDouble();
                                if (!(inputValue >= min && inputValue <= max)) {
                                        System.out.println("Enter a number between " + min + " and " + max);
                                        continue;
                                }
                                return inputValue;
                        } catch (InputMismatchException ex) {
                                System.out.println("Please enter only numbers.");
                                scanner.next();
                        }
                }
        }
}
