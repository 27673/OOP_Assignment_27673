package _27673.Q6;
import java.util.Date;

public class Payslip extends Payroll {
    private String payslipNumber;
    private Date issueDate;

    public Payslip(int id, Date createDate, Date updateDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus, double grossSalary, double totalDeductions, double netSalary, String payslipNumber, Date issueDate) {
        super(id, createDate, updateDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus, grossSalary, totalDeductions, netSalary);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() {
        return payslipNumber;
    }

    public void setPayslipNumber(String payslipNumber) {
        this.payslipNumber = payslipNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    
    public String generatePayslip() {
        
        double calculatedRSSB = getBasicPay() * 0.05;

        
        double taxableIncome = getGrossSalary() - calculatedRSSB;
        double calculatedPAYE = calculatePAYE(taxableIncome);

        
        double calculatedNetSalary = getGrossSalary() - calculatedRSSB - calculatedPAYE - getLoanDeduction();

        StringBuilder payslip = new StringBuilder();
        payslip.append("_27673"); 

        payslip.append("\n=== PAYSLIP ===");
        payslip.append("\nPayslip Number: ").append(payslipNumber);
        payslip.append("\nIssue Date: ").append(issueDate);
        payslip.append("\nRSSB Contribution: $").append(String.format("%.2f", calculatedRSSB));
        payslip.append("\nPAYE Tax: $").append(String.format("%.2f", calculatedPAYE));
        payslip.append("\nNet Salary: $").append(String.format("%.2f", calculatedNetSalary));
        payslip.append("\n=========================");

        return payslip.toString();
    }

    private double calculatePAYE(double taxableIncome) {
        
        if (taxableIncome <= 30000) {
            return taxableIncome * 0.10;
        } else if (taxableIncome <= 60000) {
            return 3000 + (taxableIncome - 30000) * 0.15;
        } else {
            return 7500 + (taxableIncome - 60000) * 0.20;
        }
    }
}