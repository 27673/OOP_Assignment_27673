package _27673.Q3;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Tax Administration System");
        System.out.println("===================================");

        
        int id = getValidId(scanner);
        String authorityName = getValidAuthorityName(scanner);
        String region = getValidRegion(scanner);
        String email = getValidEmail(scanner);
        String categoryName = getValidCategoryName(scanner);
        double rate = getValidRate(scanner);
        String code = getValidCode(scanner);
        String tin = getValidTIN(scanner);
        String taxpayerName = getValidTaxpayerName(scanner);
        String address = getValidAddress(scanner);
        String employerName = getValidEmployerName(scanner);
        String employerTIN = getValidEmployerTIN(scanner);
        String contact = getValidContact(scanner);
        String employeeName = getValidEmployeeName(scanner);
        double salary = getValidSalary(scanner);
        String employeeTIN = getValidEmployeeTIN(scanner);
        String declarationMonth = getValidDeclarationMonth(scanner);
        double totalIncome = getValidTotalIncome(scanner);
        double assessedTax = getValidAssessedTax(scanner);
        double paymentAmount = getValidPaymentAmount(scanner);
        String receiptNo = getValidReceiptNo(scanner);
        double totalTax = getValidTotalTax(scanner);

        
        TaxRecord taxRecord = new TaxRecord(
                id, new Date(), new Date(),
                authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome,
                new Date(), assessedTax,
                new Date(), paymentAmount,
                receiptNo, totalTax
        );

        
        System.out.println("\n" + taxRecord.generateTaxReport());

        
        System.out.println("\n=== ALL INSERTED DATA === 27673");
        System.out.println("ID: " + taxRecord.getId());
        System.out.println("Tax Authority: " + taxRecord.getAuthorityName() + " | Region: " + taxRecord.getRegion() + " | Email: " + taxRecord.getEmail());
        System.out.println("Tax Category: " + taxRecord.getCategoryName() + " | Code: " + taxRecord.getCode() + " | Rate: " + (taxRecord.getRate() * 100) + "%");
        System.out.println("Taxpayer: " + taxRecord.getTaxpayerName() + " | TIN: " + taxRecord.getTin() + " | Address: " + taxRecord.getAddress());
        System.out.println("Employer: " + taxRecord.getEmployerName() + " | TIN: " + taxRecord.getEmployerTIN() + " | Contact: " + taxRecord.getContact());
        System.out.println("Employee: " + taxRecord.getEmployeeName() + " | TIN: " + taxRecord.getEmployeeTIN() + " | Salary: $" + taxRecord.getSalary());
        System.out.println("Declaration: " + taxRecord.getDeclarationMonth() + " | Total Income: $" + taxRecord.getTotalIncome());
        System.out.println("Assessment: $" + taxRecord.getAssessedTax());
        System.out.println("Payment: $" + taxRecord.getPaymentAmount());
        System.out.println("Receipt: " + taxRecord.getReceiptNo() + " | Total Tax: $" + taxRecord.getTotalTax());
        System.out.println("Computed Tax: $" + String.format("%.2f", taxRecord.computeTax()));

        scanner.close();
    }

    
    private static int getValidId(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter ID (must be greater than 0): ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine(); 
                if (id > 0) {
                    return id;
                } else {
                    System.out.println("Error: ID must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidAuthorityName(Scanner scanner) {
        while (true) {
            System.out.print("Tax Authority Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Authority name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidRegion(Scanner scanner) {
        while (true) {
            System.out.print("Region: ");
            String region = scanner.nextLine();
            if (region != null && !region.trim().isEmpty()) {
                return region;
            } else {
                System.out.println("Error: Region cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidEmail(Scanner scanner) {
        while (true) {
            System.out.print("Email: ");
            String email = scanner.nextLine();
            if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return email;
            } else {
                System.out.println("Error: Invalid email format. Please try again.");
            }
        }
    }

    private static String getValidCategoryName(Scanner scanner) {
        while (true) {
            System.out.print("Tax Category Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Category name cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidRate(Scanner scanner) {
        while (true) {
            System.out.print("Tax Rate (e.g., 0.15 for 15%): ");
            if (scanner.hasNextDouble()) {
                double rate = scanner.nextDouble();
                scanner.nextLine(); 
                if (rate > 0) {
                    return rate;
                } else {
                    System.out.println("Error: Tax rate must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidCode(Scanner scanner) {
        while (true) {
            System.out.print("Tax Code (min 3 characters): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3) {
                return code;
            } else {
                System.out.println("Error: Tax code must be at least 3 characters long. Please try again.");
            }
        }
    }

    private static String getValidTIN(Scanner scanner) {
        while (true) {
            System.out.print("Taxpayer TIN (9 digits): ");
            String tin = scanner.nextLine();
            if (tin != null && tin.matches("\\d{9}")) {
                return tin;
            } else {
                System.out.println("Error: TIN must be exactly 9 digits. Please try again.");
            }
        }
    }

    private static String getValidTaxpayerName(Scanner scanner) {
        while (true) {
            System.out.print("Taxpayer Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Taxpayer name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidAddress(Scanner scanner) {
        while (true) {
            System.out.print("Address: ");
            String address = scanner.nextLine();
            if (address != null && !address.trim().isEmpty()) {
                return address;
            } else {
                System.out.println("Error: Address cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidEmployerName(Scanner scanner) {
        while (true) {
            System.out.print("Employer Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Employer name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidEmployerTIN(Scanner scanner) {
        while (true) {
            System.out.print("Employer TIN (9 digits): ");
            String tin = scanner.nextLine();
            if (tin != null && tin.matches("\\d{9}")) {
                return tin;
            } else {
                System.out.println("Error: Employer TIN must be exactly 9 digits. Please try again.");
            }
        }
    }

    private static String getValidContact(Scanner scanner) {
        while (true) {
            System.out.print("Contact (10 digits): ");
            String contact = scanner.nextLine();
            if (contact != null && contact.matches("\\d{10}")) {
                return contact;
            } else {
                System.out.println("Error: Contact must be exactly 10 digits. Please try again.");
            }
        }
    }

    private static String getValidEmployeeName(Scanner scanner) {
        while (true) {
            System.out.print("Employee Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Employee name cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidSalary(Scanner scanner) {
        while (true) {
            System.out.print("Salary: ");
            if (scanner.hasNextDouble()) {
                double salary = scanner.nextDouble();
                scanner.nextLine(); 
                if (salary > 0) {
                    return salary;
                } else {
                    System.out.println("Error: Salary must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidEmployeeTIN(Scanner scanner) {
        while (true) {
            System.out.print("Employee TIN (9 digits): ");
            String tin = scanner.nextLine();
            if (tin != null && tin.matches("\\d{9}")) {
                return tin;
            } else {
                System.out.println("Error: Employee TIN must be exactly 9 digits. Please try again.");
            }
        }
    }

    private static String getValidDeclarationMonth(Scanner scanner) {
        while (true) {
            System.out.print("Declaration Month (e.g., January 2024): ");
            String month = scanner.nextLine();
            if (month != null && !month.trim().isEmpty()) {
                return month;
            } else {
                System.out.println("Error: Declaration month cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidTotalIncome(Scanner scanner) {
        while (true) {
            System.out.print("Total Income: ");
            if (scanner.hasNextDouble()) {
                double income = scanner.nextDouble();
                scanner.nextLine(); 
                if (income >= 0) {
                    return income;
                } else {
                    System.out.println("Error: Total income cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidAssessedTax(Scanner scanner) {
        while (true) {
            System.out.print("Assessed Tax: ");
            if (scanner.hasNextDouble()) {
                double tax = scanner.nextDouble();
                scanner.nextLine(); 
                if (tax >= 0) {
                    return tax;
                } else {
                    System.out.println("Error: Assessed tax cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidPaymentAmount(Scanner scanner) {
        while (true) {
            System.out.print("Payment Amount: ");
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                scanner.nextLine(); 
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Error: Payment amount must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidReceiptNo(Scanner scanner) {
        while (true) {
            System.out.print("Receipt Number: ");
            String receipt = scanner.nextLine();
            if (receipt != null && !receipt.trim().isEmpty()) {
                return receipt;
            } else {
                System.out.println("Error: Receipt number cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidTotalTax(Scanner scanner) {
        while (true) {
            System.out.print("Total Tax: ");
            if (scanner.hasNextDouble()) {
                double tax = scanner.nextDouble();
                scanner.nextLine(); 
                if (tax >= 0) {
                    return tax;
                } else {
                    System.out.println("Error: Total tax cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }
}