package _27673.Q5;

import java.util.Date;

public class ClassSession extends Student {
    private Date sessionDate;
    private String topic;

    public ClassSession(int id, Date createDate, Date updateDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic) {
        super(id, createDate, updateDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age);
        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}