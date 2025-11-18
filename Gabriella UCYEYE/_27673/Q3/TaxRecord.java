package _27673.Q3;
import java.util.Date;

public class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, Date createDate, Date updateDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, Date assessmentDate, double assessedTax, Date paymentDate, double paymentAmount, String receiptNo, double totalTax) {
        super(id, createDate, updateDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    
    public double computeTax() {
        double salary = getSalary();
        double rate = getRate();
        double credits = 0.0;

        
        if (salary <= 30000) {
            credits = salary * 0.05; 
        } else if (salary <= 60000) {
            credits = salary * 0.03; 
        }

        double calculatedTax = (salary * rate) - credits;
        return Math.max(0, calculatedTax); 
    }

    public String generateTaxReport() {
        StringBuilder report = new StringBuilder();
        report.append("_27673"); 

        report.append("\n=== TAX ADMINISTRATION SYSTEM REPORT === 27673");
        report.append("\nReceipt Number: ").append(receiptNo);
        report.append("\nComputed Tax: $").append(String.format("%.2f", computeTax()));
        report.append("\nTotal Tax: $").append(String.format("%.2f", totalTax));
        report.append("\n========================================");

        return report.toString();
    }
}