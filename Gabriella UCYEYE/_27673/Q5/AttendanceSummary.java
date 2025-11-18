package _27673.Q5;
import java.util.Date;

public class AttendanceSummary extends LeaveRequest {
    private Date reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, Date createDate, Date updateDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String attendanceStudentID, String sessionID, String status, Date requestDate, String reason, boolean approved, Date reportDate, int totalPresent, int totalAbsent) {
        super(id, createDate, updateDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, attendanceStudentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public void setTotalAbsent(int totalAbsent) {
        this.totalAbsent = totalAbsent;
    }

    
    public String generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        double attendancePercentage = 0.0;

        if (totalSessions > 0) {
            attendancePercentage = (double) totalPresent / totalSessions * 100;
        }

        StringBuilder summary = new StringBuilder();
        summary.append("_27673"); 

        summary.append("\n=== ATTENDANCE MANAGEMENT SYSTEM SUMMARY ===27673");
        summary.append("\nReport Date: ").append(reportDate);
        summary.append("\nTotal Present: ").append(totalPresent);
        summary.append("\nTotal Absent: ").append(totalAbsent);
        summary.append("\nAttendance Percentage: ").append(String.format("%.2f", attendancePercentage)).append("%");
        summary.append("\n============================================");

        return summary.toString();
    }
}