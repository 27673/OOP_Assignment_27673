package _27673.Q6;

import java.util.Date;

public class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}