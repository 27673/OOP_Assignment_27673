package _27673.Q4;

import java.util.Date;

public class Inspection extends Delivery {
    private String inspectionName;
    private String status;
    private String remarks;

    public Inspection(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy, String inspectionName, String status, String remarks) {
        super(id, createDate, updateDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        this.inspectionName = inspectionName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectionName() {
        return inspectionName;
    }

    public void setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}