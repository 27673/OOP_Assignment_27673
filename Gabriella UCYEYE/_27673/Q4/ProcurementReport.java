package _27673.Q4;
import java.util.Date;

public class ProcurementReport extends Invoice {
    private Date reportDate;
    private String summary;

    public ProcurementReport(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy, String inspectionName, String status, String remarks, String invoiceNo, double invoiceAmount, Date reportDate, String summary) {
        super(id, createDate, updateDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectionName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    
    public double calculateTotal() {
        return getInvoiceAmount(); 
    }

    public String generateProcurementReport() {
        StringBuilder report = new StringBuilder();
        report.append("_27483"); 

        report.append("\n=== PROCUREMENT MANAGEMENT SYSTEM REPORT === 27673");
        report.append("\nReport Date: ").append(reportDate);
        report.append("\nCalculated Total: $").append(String.format("%.2f", calculateTotal()));
        report.append("\nSummary: ").append(summary);
        report.append("\n============================================");

        return report.toString();
    }
}