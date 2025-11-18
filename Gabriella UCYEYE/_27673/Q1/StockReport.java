package _27673.Q1;
import java.util.Date;

public class StockReport extends Inventory {
    private Date reportDate;
    private String remarks;

    public StockReport(int id, Date createDate, Date updateDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String supplierPName, Date saleDate, int soldQuantity, String customerName, int totalItems, double stockValue, Date reportDate, String remarks) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierPName, saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("_27673"); 

        report.append("\n=== STOCK MANAGEMENT SYSTEM REPORT ===");
        report.append("\nReport Date: ").append(reportDate);
        report.append("\nTotal Stock Items: ").append(getTotalItems());
        report.append("\nTotal Sales Quantity: ").append(getSoldQuantity());
        report.append("\nTotal Stock Value: $").append(String.format("%.2f", getStockValue()));
        report.append("\nRemarks: ").append(remarks != null ? remarks : "No remarks");
        report.append("\n=====================================");

        return report.toString();
    }
}