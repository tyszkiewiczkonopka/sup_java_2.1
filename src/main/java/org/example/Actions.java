package org.example;

import java.util.Scanner;

import static org.example.EmployeeList.employeeArrayList;

public class Actions {

    public static void performAction() {

        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("What action do you want to perform?\n" +
                    "1 - Print sum of all employees salary\n" +
                    "2 - Display all employees data\n" +
                    "3 - Add new employee\n" +
                    "4 - End program");
            action = scanner.nextInt();
            switch (action) {
                case 1 -> printTotalSalary();
                case 2 -> printAllEmployees();
                case 3 -> createNewEmployee();
                case 4 -> {
                    System.out.println("See you next time!");
                    System.exit(1);
                }
                default -> System.out.println("Invalid choice. Please try again.");

            }
        } while (action != 4);
    }

    public static void printTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employeeArrayList) {
            totalSalary += employee.getSalary();
        }
        System.out.println(totalSalary);
    }

    private static void printAllEmployees() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    private static Employee createNewEmployee(){
        return new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
    }
}
