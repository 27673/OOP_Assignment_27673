package _27673.Q5;

import java.util.Date;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, Date createDate, Date updateDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone) {
        super(id, createDate, updateDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}