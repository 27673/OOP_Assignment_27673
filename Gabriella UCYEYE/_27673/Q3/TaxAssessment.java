package _27673.Q3;

import java.util.Date;

public class TaxAssessment extends TaxDeclaration {
    private Date assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, Date createDate, Date updateDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, Date assessmentDate, double assessedTax) {
        super(id, createDate, updateDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public Date getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Date assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public double getAssessedTax() {
        return assessedTax;
    }

    public void setAssessedTax(double assessedTax) {
        this.assessedTax = assessedTax;
    }
}