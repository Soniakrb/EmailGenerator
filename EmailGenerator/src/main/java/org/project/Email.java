package org.project;

import java.security.SecureRandom;

public class Email {
    private String emailAddress;
    private String password;
    private int passwordlenght= 10;

    public Email(Employee employee) {
        this.emailAddress = generateEmailAddress(employee);
        this.password = generatePassword(passwordlenght);
    }

    // Generate email from user input
    private String generateEmailAddress(Employee employee) {
        String firstname = employee.getFirstname();
        String lastname = employee.getLastname();
        String department = employee.getDepartment();
        String company = employee.getCompany();

        return firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + company + ".com";
    }

    // Generate random password
    private String generatePassword(int length) {
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&@";
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();
        for (int i=0; i<length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        return password.toString();
    }


    public String getEmailAddress() { return emailAddress;}

    public String getPassword() { return password; }
}

