package _27673.Q6;

import java.util.Date;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private Date startDate;
    private Date endDate;

    public PayrollPeriod(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}