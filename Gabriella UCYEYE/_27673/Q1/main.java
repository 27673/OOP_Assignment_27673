package _27673.Q1;

import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Stock Management System");
        System.out.println("===================================");

        int id = getValidId(scanner);
        String warehouseName = getValidWarehouseName(scanner);
        String location = getValidLocation(scanner);
        String contactNumber = getValidContactNumber(scanner);
        String categoryName = getValidCategoryName(scanner);
        String categoryCode = getValidCategoryCode(scanner);
        String supplierName = getValidSupplierName(scanner);
        String supplierEmail = getValidSupplierEmail(scanner);
        String supplierPhone = getValidSupplierPhone(scanner);
        String productName = getValidProductName(scanner);
        double unitPrice = getValidUnitPrice(scanner);
        int stockLimit = getValidStockLimit(scanner);
        int quantityAvailable = getValidQuantityAvailable(scanner);
        int reorderLevel = getValidReorderLevel(scanner);
        int purchasedQuantity = getValidPurchasedQuantity(scanner);
        String supplierPName = getValidSupplierPName(scanner);
        int soldQuantity = getValidSoldQuantity(scanner);
        String customerName = getValidCustomerName(scanner);
        int totalItems = getValidTotalItems(scanner);
        double stockValue = getValidStockValue(scanner);
        String remarks = getRemarks(scanner);

        // Create StockReport object
        StockReport report = new StockReport(
                id, new Date(), new Date(),
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                new Date(), purchasedQuantity, supplierPName,
                new Date(), soldQuantity, customerName,
                totalItems, stockValue,
                new Date(), remarks);

        // Generate and display report
        System.out.println("\n" + report.generateReport());

        // Display all inserted data
        System.out.println("\n=== ALL INSERTED DATA ===");
        System.out.println("ID: " + report.getId());
        System.out.println("Warehouse: " + report.getWarehouseName());
        System.out.println("Location: " + report.getLocation());
        System.out.println("Contact: " + report.getContactNumber());
        System.out.println("Category: " + report.getCategoryName() + " (" + report.getCategoryCode() + ")");
        System.out.println("Supplier: " + report.getSupplierName() + " | " + report.getSupplierEmail() + " | "
                + report.getSupplierPhone());
        System.out.println("Product: " + report.getProductName() + " | $" + report.getUnitPrice() + " | Limit: "
                + report.getStockLimit());
        System.out.println(
                "Stock: " + report.getQuantityAvailable() + " available, reorder at " + report.getReorderLevel());
        System.out.println("Purchase: " + report.getPurchasedQuantity() + " from " + report.getSupplierPName());
        System.out.println("Sale: " + report.getSoldQuantity() + " to " + report.getCustomerName());
        System.out.println("Inventory: " + report.getTotalItems() + " items worth $" + report.getStockValue());
        System.out.println("Remarks: " + report.getRemarks());

        scanner.close();
    }

    // Validation methods with loops
    private static int getValidId(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter ID (must be greater than 0): ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (id > 0) {
                    return id;
                } else {
                    System.out.println("Error: ID must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    private static String getValidWarehouseName(Scanner scanner) {
        while (true) {
            System.out.print("Warehouse Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Warehouse name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidLocation(Scanner scanner) {
        while (true) {
            System.out.print("Location: ");
            String location = scanner.nextLine();
            if (location != null && !location.trim().isEmpty()) {
                return location;
            } else {
                System.out.println("Error: Location cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidContactNumber(Scanner scanner) {
        while (true) {
            System.out.print("Contact Number (10 digits): ");
            String contact = scanner.nextLine();
            if (contact != null && contact.matches("\\d{10}")) {
                return contact;
            } else {
                System.out.println("Error: Contact number must be exactly 10 digits. Please try again.");
            }
        }
    }

    private static String getValidCategoryName(Scanner scanner) {
        while (true) {
            System.out.print("Category Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Category name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidCategoryCode(Scanner scanner) {
        while (true) {
            System.out.print("Category Code (min 3 alphanumeric chars): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3 && code.matches("[a-zA-Z0-9]+")) {
                return code;
            } else {
                System.out.println(
                        "Error: Category code must be alphanumeric and at least 3 characters long. Please try again.");
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

    private static String getValidSupplierEmail(Scanner scanner) {
        while (true) {
            System.out.print("Supplier Email: ");
            String email = scanner.nextLine();
            if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return email;
            } else {
                System.out.println("Error: Invalid email format. Please try again.");
            }
        }
    }

    private static String getValidSupplierPhone(Scanner scanner) {
        while (true) {
            System.out.print("Supplier Phone (10 digits): ");
            String phone = scanner.nextLine();
            if (phone != null && phone.matches("\\d{10}")) {
                return phone;
            } else {
                System.out.println("Error: Supplier phone must be exactly 10 digits. Please try again.");
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

    private static int getValidStockLimit(Scanner scanner) {
        while (true) {
            System.out.print("Stock Limit: ");
            if (scanner.hasNextInt()) {
                int limit = scanner.nextInt();
                scanner.nextLine();
                if (limit >= 0) {
                    return limit;
                } else {
                    System.out.println("Error: Stock limit cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static int getValidQuantityAvailable(Scanner scanner) {
        while (true) {
            System.out.print("Quantity Available: ");
            if (scanner.hasNextInt()) {
                int quantity = scanner.nextInt();
                scanner.nextLine();
                if (quantity >= 0) {
                    return quantity;
                } else {
                    System.out.println("Error: Quantity available cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static int getValidReorderLevel(Scanner scanner) {
        while (true) {
            System.out.print("Reorder Level: ");
            if (scanner.hasNextInt()) {
                int level = scanner.nextInt();
                scanner.nextLine();
                if (level >= 0) {
                    return level;
                } else {
                    System.out.println("Error: Reorder level cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static int getValidPurchasedQuantity(Scanner scanner) {
        while (true) {
            System.out.print("Purchased Quantity: ");
            if (scanner.hasNextInt()) {
                int quantity = scanner.nextInt();
                scanner.nextLine();
                if (quantity > 0) {
                    return quantity;
                } else {
                    System.out.println("Error: Purchased quantity must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static String getValidSupplierPName(Scanner scanner) {
        while (true) {
            System.out.print("Purchase Supplier Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Purchase supplier name cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidSoldQuantity(Scanner scanner) {
        while (true) {
            System.out.print("Sold Quantity: ");
            if (scanner.hasNextInt()) {
                int quantity = scanner.nextInt();
                scanner.nextLine();
                if (quantity > 0) {
                    return quantity;
                } else {
                    System.out.println("Error: Sold quantity must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static String getValidCustomerName(Scanner scanner) {
        while (true) {
            System.out.print("Customer Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Customer name cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidTotalItems(Scanner scanner) {
        while (true) {
            System.out.print("Total Items: ");
            if (scanner.hasNextInt()) {
                int items = scanner.nextInt();
                scanner.nextLine();
                if (items >= 0) {
                    return items;
                } else {
                    System.out.println("Error: Total items cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static double getValidStockValue(Scanner scanner) {
        while (true) {
            System.out.print("Stock Value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Error: Stock value cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static String getRemarks(Scanner scanner) {
        System.out.print("Remarks: ");
        return scanner.nextLine();
    }
}