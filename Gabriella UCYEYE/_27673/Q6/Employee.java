package _27673.Q6;

import java.util.Date;

public class Employee extends Department {
    private String employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public boolean isRssbRegistered() {
        return rssbRegistered;
    }

    public void setRssbRegistered(boolean rssbRegistered) {
        this.rssbRegistered = rssbRegistered;
    }
}