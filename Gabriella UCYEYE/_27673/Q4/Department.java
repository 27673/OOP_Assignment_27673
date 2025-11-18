package _27673.Q4;

import java.util.Date;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, Date createDate, Date updateDate, String orgName, String address, String contactEmail, String deptName, String deptCode) {
        super(id, createDate, updateDate, orgName, address, contactEmail);
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}