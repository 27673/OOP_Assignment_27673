package _27673.Q3;

import java.util.Date;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, Date createDate, Date updateDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome) {
        super(id, createDate, updateDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() {
        return declarationMonth;
    }

    public void setDeclarationMonth(String declarationMonth) {
        this.declarationMonth = declarationMonth;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }
}