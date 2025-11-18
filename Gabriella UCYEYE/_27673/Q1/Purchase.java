package _27673.Q1;
import java.util.Date;

public class Purchase extends StockItem {
    private Date purchaseDate;
    private int purchasedQuantity;
    private String supplierPName;

    public Purchase(int id, Date createDate, Date updateDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, Date purchaseDate, int purchasedQuantity, String supplierPName) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierPName = supplierPName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getSupplierPName() {
        return supplierPName;
    }

    public void setSupplierPName(String supplierPName) {
        this.supplierPName = supplierPName;
    }
}