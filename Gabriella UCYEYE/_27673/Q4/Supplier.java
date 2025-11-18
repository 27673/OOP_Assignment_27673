package _27673.Q4;

import java.util.Date;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, createDate, updateDate, orgName, address, contactEmail, deptName, deptCode);
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierTIN() {
        return supplierTIN;
    }

    public void setSupplierTIN(String supplierTIN) {
        this.supplierTIN = supplierTIN;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}