package org.example;

import java.util.ArrayList;


public class EmployeeList {
    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void addEmployeeToList(Employee employee){
        employeeArrayList.add(employee);
    }


}
