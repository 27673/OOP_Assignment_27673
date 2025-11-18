package _27673.Q1;

import java.util.Date;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, Date createDate, Date updateDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}