package _27673.Q1;

import java.util.Date;

public class Entity {
    private int id;
    private Date createDate;
    private Date updateDate;

    public Entity(int id, Date createDate, Date updateDate) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}