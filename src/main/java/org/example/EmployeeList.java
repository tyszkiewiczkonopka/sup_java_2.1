package org.example;

import java.util.ArrayList;


public class EmployeeList {
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployeeToList(Employee employee){
        employees.add(employee);
    }


}
