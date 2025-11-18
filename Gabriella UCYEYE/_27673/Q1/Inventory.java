package _27673.Q1;

import java.util.Date;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, Date createDate, Date updateDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String supplierPName, Date saleDate, int soldQuantity, String customerName, int totalItems, double stockValue) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierPName, saleDate, soldQuantity, customerName);
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }
}