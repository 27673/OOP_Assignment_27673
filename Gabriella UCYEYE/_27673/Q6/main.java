package _27673.Q6;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Payroll Management System (RSSB)");
        System.out.println("=========================================");

        
        int id = getValidId(scanner);
        String orgName = getValidOrgName(scanner);
        String orgCode = getValidOrgCode(scanner);
        String rssbNumber = getValidRssbNumber(scanner);
        String contactEmail = getValidContactEmail(scanner);
        String deptName = getValidDeptName(scanner);
        String deptCode = getValidDeptCode(scanner);
        String managerName = getValidManagerName(scanner);
        String employeeID = getValidEmployeeID(scanner);
        String fullName = getValidFullName(scanner);
        String position = getValidPosition(scanner);
        double baseSalary = getValidBaseSalary(scanner);
        boolean rssbRegistered = getValidRssbRegistered(scanner);
        int month = getValidMonth(scanner);
        int year = getValidYear(scanner);
        double basicPay = getValidBasicPay(scanner);
        double transportAllowance = getValidTransportAllowance(scanner);
        double housingAllowance = getValidHousingAllowance(scanner);
        double loanDeduction = getValidLoanDeduction(scanner);
        double overtimeHours = getValidOvertimeHours(scanner);
        double overtimeRate = getValidOvertimeRate(scanner);
        double bonus = getValidBonus(scanner);
        double grossSalary = getValidGrossSalary(scanner);
        double totalDeductions = getValidTotalDeductions(scanner);
        double netSalary = getValidNetSalary(scanner);
        String payslipNumber = getValidPayslipNumber(scanner);

        
        Payslip payslip = new Payslip(
                id, new Date(), new Date(),
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, new Date(), new Date(),
                basicPay, transportAllowance, housingAllowance,
                0, 0, loanDeduction, 
                overtimeHours, overtimeRate, bonus,
                grossSalary, totalDeductions, netSalary,
                payslipNumber, new Date()
        );

        
        System.out.println("\n" + payslip.generatePayslip());

        
        System.out.println("\n=== ALL INSERTED DATA === 27673");
        System.out.println("ID: " + payslip.getId());
        System.out.println("Organization: " + payslip.getOrgName() + " | Code: " + payslip.getOrgCode() + " | RSSB: " + payslip.getRssbNumber());
        System.out.println("Email: " + payslip.getContactEmail());
        System.out.println("Department: " + payslip.getDeptName() + " | Code: " + payslip.getDeptCode() + " | Manager: " + payslip.getManagerName());
        System.out.println("Employee: " + payslip.getFullName() + " | ID: " + payslip.getEmployeeID() + " | Position: " + payslip.getPosition());
        System.out.println("Base Salary: $" + payslip.getBaseSalary() + " | RSSB Registered: " + payslip.isRssbRegistered());
        System.out.println("Pay Period: " + payslip.getMonth() + "/" + payslip.getYear());
        System.out.println("Basic Pay: $" + payslip.getBasicPay());
        System.out.println("Allowances - Transport: $" + payslip.getTransportAllowance() + " | Housing: $" + payslip.getHousingAllowance());
        System.out.println("Overtime: " + payslip.getOvertimeHours() + " hours @ $" + payslip.getOvertimeRate());
        System.out.println("Bonus: $" + payslip.getBonus());
        System.out.println("Deductions - Loan: $" + payslip.getLoanDeduction());
        System.out.println("Gross Salary: $" + payslip.getGrossSalary() + " | Total Deductions: $" + payslip.getTotalDeductions() + " | Net Salary: $" + payslip.getNetSalary());
        System.out.println("Payslip Number: " + payslip.getPayslipNumber());

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

    private static String getValidOrgCode(Scanner scanner) {
        while (true) {
            System.out.print("Organization Code (min 3 characters): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3) {
                return code;
            } else {
                System.out.println("Error: Organization code must be at least 3 characters long. Please try again.");
            }
        }
    }

    private static String getValidRssbNumber(Scanner scanner) {
        while (true) {
            System.out.print("RSSB Number (8 digits): ");
            String rssb = scanner.nextLine();
            if (rssb != null && rssb.matches("\\d{8}")) {
                return rssb;
            } else {
                System.out.println("Error: RSSB number must be exactly 8 digits. Please try again.");
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
            System.out.print("Department Code (min 3 characters): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3) {
                return code;
            } else {
                System.out.println("Error: Department code must be at least 3 characters long. Please try again.");
            }
        }
    }

    private static String getValidManagerName(Scanner scanner) {
        while (true) {
            System.out.print("Manager Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Manager name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidEmployeeID(Scanner scanner) {
        while (true) {
            System.out.print("Employee ID (min 1000): ");
            String id = scanner.nextLine();
            if (id != null && !id.trim().isEmpty()) {
                try {
                    int employeeId = Integer.parseInt(id);
                    if (employeeId >= 1000) {
                        return id;
                    } else {
                        System.out.println("Error: Employee ID must be at least 1000. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Employee ID must be a number. Please try again.");
                }
            } else {
                System.out.println("Error: Employee ID cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidFullName(Scanner scanner) {
        while (true) {
            System.out.print("Employee Full Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Employee name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidPosition(Scanner scanner) {
        while (true) {
            System.out.print("Position: ");
            String position = scanner.nextLine();
            if (position != null && !position.trim().isEmpty()) {
                return position;
            } else {
                System.out.println("Error: Position cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidBaseSalary(Scanner scanner) {
        while (true) {
            System.out.print("Base Salary: ");
            if (scanner.hasNextDouble()) {
                double salary = scanner.nextDouble();
                scanner.nextLine(); 
                if (salary > 0) {
                    return salary;
                } else {
                    System.out.println("Error: Base salary must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static boolean getValidRssbRegistered(Scanner scanner) {
        while (true) {
            System.out.print("RSSB Registered (true/false): ");
            String input = scanner.nextLine();
            if (input != null && (input.equals("true") || input.equals("false"))) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("Error: Please enter 'true' or 'false'. Please try again.");
            }
        }
    }

    private static int getValidMonth(Scanner scanner) {
        while (true) {
            System.out.print("Payroll Month (1-12): ");
            if (scanner.hasNextInt()) {
                int month = scanner.nextInt();
                scanner.nextLine(); 
                if (month >= 1 && month <= 12) {
                    return month;
                } else {
                    System.out.println("Error: Month must be between 1 and 12. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static int getValidYear(Scanner scanner) {
        while (true) {
            System.out.print("Payroll Year (>= 2000): ");
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                scanner.nextLine(); 
                if (year >= 2000) {
                    return year;
                } else {
                    System.out.println("Error: Year must be 2000 or later. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidBasicPay(Scanner scanner) {
        while (true) {
            System.out.print("Basic Pay: ");
            if (scanner.hasNextDouble()) {
                double pay = scanner.nextDouble();
                scanner.nextLine(); 
                if (pay >= 0) {
                    return pay;
                } else {
                    System.out.println("Error: Basic pay cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidTransportAllowance(Scanner scanner) {
        while (true) {
            System.out.print("Transport Allowance: ");
            if (scanner.hasNextDouble()) {
                double allowance = scanner.nextDouble();
                scanner.nextLine(); 
                if (allowance >= 0) {
                    return allowance;
                } else {
                    System.out.println("Error: Transport allowance cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidHousingAllowance(Scanner scanner) {
        while (true) {
            System.out.print("Housing Allowance: ");
            if (scanner.hasNextDouble()) {
                double allowance = scanner.nextDouble();
                scanner.nextLine(); 
                if (allowance >= 0) {
                    return allowance;
                } else {
                    System.out.println("Error: Housing allowance cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidLoanDeduction(Scanner scanner) {
        while (true) {
            System.out.print("Loan Deduction: ");
            if (scanner.hasNextDouble()) {
                double deduction = scanner.nextDouble();
                scanner.nextLine(); 
                if (deduction >= 0) {
                    return deduction;
                } else {
                    System.out.println("Error: Loan deduction cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidOvertimeHours(Scanner scanner) {
        while (true) {
            System.out.print("Overtime Hours: ");
            if (scanner.hasNextDouble()) {
                double hours = scanner.nextDouble();
                scanner.nextLine(); 
                if (hours >= 0) {
                    return hours;
                } else {
                    System.out.println("Error: Overtime hours cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidOvertimeRate(Scanner scanner) {
        while (true) {
            System.out.print("Overtime Rate: ");
            if (scanner.hasNextDouble()) {
                double rate = scanner.nextDouble();
                scanner.nextLine(); 
                if (rate >= 0) {
                    return rate;
                } else {
                    System.out.println("Error: Overtime rate cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidBonus(Scanner scanner) {
        while (true) {
            System.out.print("Bonus: ");
            if (scanner.hasNextDouble()) {
                double bonus = scanner.nextDouble();
                scanner.nextLine(); 
                if (bonus >= 0) {
                    return bonus;
                } else {
                    System.out.println("Error: Bonus cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidGrossSalary(Scanner scanner) {
        while (true) {
            System.out.print("Gross Salary: ");
            if (scanner.hasNextDouble()) {
                double salary = scanner.nextDouble();
                scanner.nextLine(); 
                if (salary >= 0) {
                    return salary;
                } else {
                    System.out.println("Error: Gross salary cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidTotalDeductions(Scanner scanner) {
        while (true) {
            System.out.print("Total Deductions: ");
            if (scanner.hasNextDouble()) {
                double deductions = scanner.nextDouble();
                scanner.nextLine(); 
                if (deductions >= 0) {
                    return deductions;
                } else {
                    System.out.println("Error: Total deductions cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static double getValidNetSalary(Scanner scanner) {
        while (true) {
            System.out.print("Net Salary: ");
            if (scanner.hasNextDouble()) {
                double salary = scanner.nextDouble();
                scanner.nextLine(); 
                if (salary >= 0) {
                    return salary;
                } else {
                    System.out.println("Error: Net salary cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidPayslipNumber(Scanner scanner) {
        while (true) {
            System.out.print("Payslip Number: ");
            String number = scanner.nextLine();
            if (number != null && !number.trim().isEmpty()) {
                return number;
            } else {
                System.out.println("Error: Payslip number cannot be empty. Please try again.");
            }
        }
    }
}