package org.example;

import java.util.Scanner;

public class EmployeeReader {

    public String readFirstName() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";

        while (firstName.isEmpty()) {
            System.out.print("Enter the FIRST NAME of the new employee: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("FIRST NAME cannot be empty. Please try again.");
            }
        }
        return firstName;
    }

    public String readLastName() {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";

        while (lastName.isEmpty()) {
            System.out.print("Enter the LAST NAME of the new employee: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("LAST NAME cannot be empty. Please try again.");
            }
        }
        return lastName;
    }

    public int readSalary() {
        Scanner scanner = new Scanner(System.in);
        int salary = -1;

        while (salary < 0) {
            System.out.print("Enter the SALARY of the new employee: ");

            if (scanner.hasNextInt()) {
                salary = scanner.nextInt();

                if (salary < 0) {
                    System.out.println("SALARY cannot be below 0. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        return salary;
    }

}
