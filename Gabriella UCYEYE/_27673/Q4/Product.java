package _27673.Q4;

import java.util.Date;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity) {
        super(id, createDate, updateDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact);
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}