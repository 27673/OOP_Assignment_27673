package _27673.Q4;

import java.util.Date;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail) {
        super(id, createDate, updateDate);
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}