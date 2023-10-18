package org.example;

import java.util.Scanner;

public class EmployeeReader {

    private static void printHint(String inputName) {
        System.out.print("Enter the " + inputName + " of the new employee: ");
    }

    private static void printWarningEmpty(String inputName) {
        System.out.println(inputName + " cannot be empty. Please try again.");

    }

    private static void printWarningBelowZero(String inputName) {
        System.out.println(inputName + " cannot be below 0. Please try again.");

    }

    private static void printWarningInvalidInput() {
        System.out.println("Invalid input. Please enter a valid number.");

    }

    public String readFirstName() {
        return readStringValue("FIRST NAME");
    }

    public String readLastName() {
        return readStringValue("LAST NAME");
    }

    private String readStringValue(String name) {
        Scanner scanner = new Scanner(System.in);
        String stringValue = "";

        while (stringValue.isEmpty()) {
            printHint(name);
            stringValue = scanner.nextLine().trim();
            if (stringValue.isEmpty()) {
                printWarningEmpty(name);
            }
        }
        return stringValue;

    }

    public int readSalary() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printHint("SALARY");

            if (scanner.hasNextInt()) {
                int salary = scanner.nextInt();

                if (salary >= 0) {
                    return salary;
                } else {
                    printWarningBelowZero("SALARY");
                }
            } else {
                printWarningInvalidInput();
                scanner.next();
            }
        }
    }
}
