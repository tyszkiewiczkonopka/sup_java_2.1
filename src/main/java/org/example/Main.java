package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name");
        String firstName = scanner.nextLine();
        System.out.println("Last name");
        String lastName = scanner.nextLine();
        System.out.println("Salary");
        int salary = scanner.nextInt();

        Employee employee = new Employee(firstName, lastName, salary);


    }
}