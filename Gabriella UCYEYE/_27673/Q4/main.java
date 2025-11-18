package _27673.Q4;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Procurement Management System");
        System.out.println("======================================");

        
        int id = getValidId(scanner);
        String orgName = getValidOrgName(scanner);
        String address = getValidAddress(scanner);
        String contactEmail = getValidContactEmail(scanner);
        String deptName = getValidDeptName(scanner);
        String deptCode = getValidDeptCode(scanner);
        String supplierName = getValidSupplierName(scanner);
        String supplierTIN = getValidSupplierTIN(scanner);
        String contact = getValidContact(scanner);
        String productName = getValidProductName(scanner);
        double unitPrice = getValidUnitPrice(scanner);
        int quantity = getValidQuantity(scanner);
        String poNumber = getValidPoNumber(scanner);
        double totalAmount = getValidTotalAmount(scanner);
        String deliveredBy = getValidDeliveredBy(scanner);
        String inspectionName = getValidInspectionName(scanner);
        String status = getValidStatus(scanner);
        String remarks = getValidRemarks(scanner);
        String invoiceNo = getValidInvoiceNo(scanner);
        double invoiceAmount = getValidInvoiceAmount(scanner);
        String summary = getValidSummary(scanner);

        
        ProcurementReport report = new ProcurementReport(
                id, new Date(), new Date(),
                orgName, address, contactEmail,
                deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, new Date(), totalAmount,
                new Date(), deliveredBy,
                inspectionName, status, remarks,
                invoiceNo, invoiceAmount,
                new Date(), summary
        );

        
        System.out.println("\n" + report.generateProcurementReport());

        
        System.out.println("\n=== ALL INSERTED DATA === 27673");
        System.out.println("ID: " + report.getId());
        System.out.println("Organization: " + report.getOrgName() + " | Address: " + report.getAddress() + " | Email: " + report.getContactEmail());
        System.out.println("Department: " + report.getDeptName() + " | Code: " + report.getDeptCode());
        System.out.println("Supplier: " + report.getSupplierName() + " | TIN: " + report.getSupplierTIN() + " | Contact: " + report.getContact());
        System.out.println("Product: " + report.getProductName() + " | Unit Price: $" + report.getUnitPrice() + " | Quantity: " + report.getQuantity());
        System.out.println("Purchase Order: " + report.getPoNumber() + " | Total Amount: $" + report.getTotalAmount());
        System.out.println("Delivery: Delivered by " + report.getDeliveredBy());
        System.out.println("Inspection: " + report.getInspectionName() + " | Status: " + report.getStatus() + " | Remarks: " + report.getRemarks());
        System.out.println("Invoice: " + report.getInvoiceNo() + " | Amount: $" + report.getInvoiceAmount());
        System.out.println("Summary: " + report.getSummary());
        System.out.println("Calculated Total: $" + String.format("%.2f", report.calculateTotal()));

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

    private static String getValidOrgName(Scanner scanner) {
        while (true) {
            System.out.print("Organization Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Organization name cannot be empty. Please try again.");
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

    private static String getValidContactEmail(Scanner scanner) {
        while (true) {
            System.out.print("Contact Email: ");
            String email = scanner.nextLine();
            if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return email;
            } else {
                System.out.println("Error: Invalid email format. Please try again.");
            }
        }
    }

    private static String getValidDeptName(Scanner scanner) {
        while (true) {
            System.out.print("Department Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Department name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidDeptCode(Scanner scanner) {
        while (true) {
            System.out.print("Department Code (min 3 alphanumeric chars): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3 && code.matches("[a-zA-Z0-9]+")) {
                return code;
            } else {
                System.out.println("Error: Department code must be alphanumeric and at least 3 characters long. Please try again.");
            }
        }
    }

    private static String getValidSupplierName(Scanner scanner) {
        while (true) {
            System.out.print("Supplier Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Supplier name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidSupplierTIN(Scanner scanner) {
        while (true) {
            System.out.print("Supplier TIN (9 digits): ");
            String tin = scanner.nextLine();
            if (tin != null && tin.matches("\\d{9}")) {
                return tin;
            } else {
                System.out.println("Error: Supplier TIN must be exactly 9 digits. Please try again.");
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

    private static String getValidProductName(Scanner scanner) {
        while (true) {
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Product name cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidUnitPrice(Scanner scanner) {
        while (true) {
            System.out.print("Unit Price: ");
            if (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                scanner.nextLine(); 
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("Error: Unit price must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static int getValidQuantity(Scanner scanner) {
        while (true) {
            System.out.print("Quantity: ");
            if (scanner.hasNextInt()) {
                int quantity = scanner.nextInt();
                scanner.nextLine(); 
                if (quantity >= 0) {
                    return quantity;
                } else {
                    System.out.println("Error: Quantity cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidPoNumber(Scanner scanner) {
        while (true) {
            System.out.print("Purchase Order Number: ");
            String poNumber = scanner.nextLine();
            if (poNumber != null && !poNumber.trim().isEmpty()) {
                return poNumber;
            } else {
                System.out.println("Error: Purchase order number cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidTotalAmount(Scanner scanner) {
        while (true) {
            System.out.print("Total Amount: ");
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                scanner.nextLine(); 
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Error: Total amount must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidDeliveredBy(Scanner scanner) {
        while (true) {
            System.out.print("Delivered By: ");
            String deliveredBy = scanner.nextLine();
            if (deliveredBy != null && !deliveredBy.trim().isEmpty()) {
                return deliveredBy;
            } else {
                System.out.println("Error: Delivered by cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidInspectionName(Scanner scanner) {
        while (true) {
            System.out.print("Inspection Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Inspection name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidStatus(Scanner scanner) {
        while (true) {
            System.out.print("Inspection Status (Passed/Failed): ");
            String status = scanner.nextLine();
            if (status != null && (status.equals("Passed") || status.equals("Failed"))) {
                return status;
            } else {
                System.out.println("Error: Status must be 'Passed' or 'Failed'. Please try again.");
            }
        }
    }

    private static String getValidRemarks(Scanner scanner) {
        System.out.print("Remarks: ");
        return scanner.nextLine();
    }

    private static String getValidInvoiceNo(Scanner scanner) {
        while (true) {
            System.out.print("Invoice Number: ");
            String invoiceNo = scanner.nextLine();
            if (invoiceNo != null && !invoiceNo.trim().isEmpty()) {
                return invoiceNo;
            } else {
                System.out.println("Error: Invoice number cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidInvoiceAmount(Scanner scanner) {
        while (true) {
            System.out.print("Invoice Amount: ");
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                scanner.nextLine(); 
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Error: Invoice amount must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidSummary(Scanner scanner) {
        System.out.print("Summary: ");
        return scanner.nextLine();
    }
}