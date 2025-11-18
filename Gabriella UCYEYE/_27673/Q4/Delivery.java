package _27673.Q4;

import java.util.Date;

public class Delivery extends PurchaseOrder {
    private Date deliveryDate;
    private String deliveredBy;

    public Delivery(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy) {
        super(id, createDate, updateDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }
}