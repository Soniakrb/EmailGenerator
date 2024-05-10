package org.project;

public class Employee {
    private String firstname;
    private String lastname;
    private int id;
    private String department;
    private Email email;
    private String company;


    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }
}
