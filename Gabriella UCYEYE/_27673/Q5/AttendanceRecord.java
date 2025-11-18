package _27673.Q5;

import java.util.Date;

public class AttendanceRecord extends ClassSession {
    private String studentID;
    private String sessionID;
    private String status;

    public AttendanceRecord(int id, Date createDate, Date updateDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String attendanceStudentID, String sessionID, String status) {
        super(id, createDate, updateDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        this.studentID = attendanceStudentID;
        this.sessionID = sessionID;
        this.status = status;
    }

    public String getAttendanceStudentID() {
        return studentID;
    }

    public void setAttendanceStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}