package org.example;

import java.util.ArrayList;


public class EmployeeList {
    static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    static int totalEmployees = 0;
    public void addEmployeeToList(Employee employee){
        employeeArrayList.add(employee);
        totalEmployees++;
    }


}
