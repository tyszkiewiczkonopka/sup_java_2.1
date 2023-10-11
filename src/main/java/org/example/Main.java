package org.example;


public class Main {
    public static void main(String[] args) {

        EmployeeList employeeList = new EmployeeList();

        Employee maja = new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
        employeeList.addEmployeeToList(maja);
        Employee kinga = new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
        employeeList.addEmployeeToList(kinga);
        Employee michal = new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
        employeeList.addEmployeeToList(michal);
        Employee kamil = new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
        employeeList.addEmployeeToList(kamil);
        Employee bartek = new Employee(EmployeeReader.readFirstName(), EmployeeReader.readLastName(), EmployeeReader.readSalary());
        employeeList.addEmployeeToList(bartek);

        Actions.performAction();


    }


}