package org.example;


public class Main {
    public static void main(String[] args) {

        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.initializeEmployees();
        employeeManager.showMenu();

    }
}