package _27673.Q5;

import java.util.Date;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, Date createDate, Date updateDate, String institutionName, String code, String address, String departmentName, String departmentHead) {
        super(id, createDate, updateDate, institutionName, code, address);
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }
}