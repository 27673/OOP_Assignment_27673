package _27673.Q3;

import java.util.Date;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, Date createDate, Date updateDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN) {
        super(id, createDate, updateDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }

    public void setEmployeeTIN(String employeeTIN) {
        this.employeeTIN = employeeTIN;
    }
}