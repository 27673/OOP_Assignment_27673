package _27673.Q6;

import java.util.Date;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }

    public void setHousingAllowance(double housingAllowance) {
        this.housingAllowance = housingAllowance;
    }
}