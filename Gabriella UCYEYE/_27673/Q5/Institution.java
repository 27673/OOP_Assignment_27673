package _27673.Q5;

import java.util.Date;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, Date createDate, Date updateDate, String institutionName, String code, String address) {
        super(id, createDate, updateDate);
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}