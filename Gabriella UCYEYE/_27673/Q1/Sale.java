package _27673.Q1;
import java.util.Date;

public class Sale extends Purchase {
    private Date saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, Date createDate, Date updateDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String supplierPName, Date saleDate, int soldQuantity, String customerName) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierPName);
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}