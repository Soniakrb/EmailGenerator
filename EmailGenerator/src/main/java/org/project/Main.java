package org.project;

public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeDataInput.getEmployeeData();

        Email email = new Email(employee);

        System.out.println("Generated Email: " + email.getEmailAddress());
        System.out.println("Generated Password: " + email.getPassword());
    }
}