package org.example;

import java.util.Scanner;

public class EmployeeReader {


    public String readFirstName() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";

        while (firstName.isEmpty()) {
            printHint("FIRST NAME");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                printWarningEmpty("FIRST NAME");
            }
        }
        return firstName;
    }

    public String readLastName() {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";

        while (lastName.isEmpty()) {
            printHint("LAST NAME");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                printWarningEmpty("LAST NAME");
            }
        }
        return lastName;
    }
    private static void printHint(String inputName) {
        System.out.print("Enter the " + inputName + " of the new employee: ");
    }

    private static void printWarningEmpty(String inputName) {
        System.out.println(inputName + " cannot be empty. Please try again.");

    }

    public int readSalary() {
        Scanner scanner = new Scanner(System.in);
        int salary = -1;

        while (salary < 0) {
            printHint("SALARY");
            if (scanner.hasNextInt()) {
                salary = scanner.nextInt();

                if (salary < 0) {
                    printWarningBelowZero("SALARY");                }
            } else {
                printWarningInvalidInput();
                scanner.next();
            }
        }
        return salary;
    }
    private static void printWarningBelowZero(String inputName) {
        System.out.println(inputName + " cannot be below 0. Please try again.");

    }
    private static void printWarningInvalidInput() {
        System.out.println("Invalid input. Please enter a valid number.");

    }
}
