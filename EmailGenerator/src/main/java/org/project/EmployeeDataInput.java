package org.project;

import java.util.Scanner;

public class EmployeeDataInput {

    public static Employee getEmployeeData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new employee details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("Company: ");
        String company = scanner.nextLine();

        // Creating an Employee object to store the info
        Employee employee = new Employee();
        employee.setFirstname(firstName);
        employee.setLastname(lastName);
        employee.setId(id);
        employee.setDepartment(department);
        employee.setCompany(company);

        return employee;
    }
}

