package org.example;

import java.util.Scanner;

public class EmployeeManager {
    private EmployeeList employeeList;
    private EmployeeReader employeeReader;
    private static final int INITIAL_EMPLOYEE_NUMBER = 5;

    public EmployeeManager() {
        this.employeeList = new EmployeeList();
        this.employeeReader = new EmployeeReader();
    }

    public void initializeEmployees() {
        for (int i = 0; i < INITIAL_EMPLOYEE_NUMBER; i++) {
         createNewEmployee();
        }
    }

    public void showMenu() {

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

    private void printTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employeeList.getEmployeeArrayList()) {
            totalSalary += employee.getSalary();
        }
        System.out.println(totalSalary);
    }

    private void printAllEmployees() {
        for (Employee employee : employeeList.getEmployeeArrayList()) {
            System.out.println(employee);
        }
    }

    private void createNewEmployee() {
        Employee employee = new Employee(employeeReader.readFirstName(), employeeReader.readLastName(), employeeReader.readSalary());
        employeeList.addEmployeeToList(employee);
    }
}
