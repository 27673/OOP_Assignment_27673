package _27673.Q6;

import java.util.Date;

public class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        this.rssbContribution = rssbContribution;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }

    public double getRssbContribution() {
        return rssbContribution;
    }

    public void setRssbContribution(double rssbContribution) {
        this.rssbContribution = rssbContribution;
    }

    public double getPayeTax() {
        return payeTax;
    }

    public void setPayeTax(double payeTax) {
        this.payeTax = payeTax;
    }

    public double getLoanDeduction() {
        return loanDeduction;
    }

    public void setLoanDeduction(double loanDeduction) {
        this.loanDeduction = loanDeduction;
    }
}