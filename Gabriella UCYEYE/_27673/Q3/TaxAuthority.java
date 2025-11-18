package _27673.Q3;

import java.util.Date;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, Date createDate, Date updateDate, String authorityName, String region, String email) {
        super(id, createDate, updateDate);
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}