package _27673.Q5;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Attendance Management System");
        System.out.println("=====================================");

        
        int id = getValidId(scanner);
        String institutionName = getValidInstitutionName(scanner);
        String code = getValidCode(scanner);
        String address = getValidAddress(scanner);
        String departmentName = getValidDepartmentName(scanner);
        String departmentHead = getValidDepartmentHead(scanner);
        String courseName = getValidCourseName(scanner);
        String courseCode = getValidCourseCode(scanner);
        int credits = getValidCredits(scanner);
        String instructorName = getValidInstructorName(scanner);
        String email = getValidEmail(scanner);
        String phone = getValidPhone(scanner);
        String studentName = getValidStudentName(scanner);
        String studentID = getValidStudentID(scanner);
        int age = getValidAge(scanner);
        String topic = getValidTopic(scanner);
        String attendanceStudentID = getValidAttendanceStudentID(scanner);
        String sessionID = getValidSessionID(scanner);
        String status = getValidStatus(scanner);
        String reason = getValidReason(scanner);
        boolean approved = getValidApproved(scanner);
        int totalPresent = getValidTotalPresent(scanner);
        int totalAbsent = getValidTotalAbsent(scanner);

        
        AttendanceSummary summary = new AttendanceSummary(
                id, new Date(), new Date(),
                institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                new Date(), topic,
                attendanceStudentID, sessionID, status,
                new Date(), reason, approved,
                new Date(), totalPresent, totalAbsent
        );

        
        System.out.println("\n" + summary.generateSummary());

        
        System.out.println("\n=== ALL INSERTED DATA ===27673");
        System.out.println("ID: " + summary.getId());
        System.out.println("Institution: " + summary.getInstitutionName() + " | Code: " + summary.getCode() + " | Address: " + summary.getAddress());
        System.out.println("Department: " + summary.getDepartmentName() + " | Head: " + summary.getDepartmentHead());
        System.out.println("Course: " + summary.getCourseName() + " | Code: " + summary.getCourseCode() + " | Credits: " + summary.getCredits());
        System.out.println("Instructor: " + summary.getInstructorName() + " | Email: " + summary.getEmail() + " | Phone: " + summary.getPhone());
        System.out.println("Student: " + summary.getStudentName() + " | ID: " + summary.getStudentID() + " | Age: " + summary.getAge());
        System.out.println("Session Topic: " + summary.getTopic());
        System.out.println("Attendance: Student ID: " + summary.getAttendanceStudentID() + " | Session ID: " + summary.getSessionID() + " | Status: " + summary.getStatus());
        System.out.println("Leave Request: Reason: " + summary.getReason() + " | Approved: " + summary.isApproved());
        System.out.println("Total Present: " + summary.getTotalPresent() + " | Total Absent: " + summary.getTotalAbsent());

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

    private static String getValidInstitutionName(Scanner scanner) {
        while (true) {
            System.out.print("Institution Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Institution name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidCode(Scanner scanner) {
        while (true) {
            System.out.print("Institution Code (min 3 characters): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 3) {
                return code;
            } else {
                System.out.println("Error: Institution code must be at least 3 characters long. Please try again.");
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

    private static String getValidDepartmentName(Scanner scanner) {
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

    private static String getValidDepartmentHead(Scanner scanner) {
        while (true) {
            System.out.print("Department Head: ");
            String head = scanner.nextLine();
            if (head != null && !head.trim().isEmpty()) {
                return head;
            } else {
                System.out.println("Error: Department head cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidCourseName(Scanner scanner) {
        while (true) {
            System.out.print("Course Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Course name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidCourseCode(Scanner scanner) {
        while (true) {
            System.out.print("Course Code: ");
            String code = scanner.nextLine();
            if (code != null && !code.trim().isEmpty()) {
                return code;
            } else {
                System.out.println("Error: Course code cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidCredits(Scanner scanner) {
        while (true) {
            System.out.print("Credits: ");
            if (scanner.hasNextInt()) {
                int credits = scanner.nextInt();
                scanner.nextLine(); 
                if (credits > 0) {
                    return credits;
                } else {
                    System.out.println("Error: Credits must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidInstructorName(Scanner scanner) {
        while (true) {
            System.out.print("Instructor Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Instructor name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidEmail(Scanner scanner) {
        while (true) {
            System.out.print("Instructor Email: ");
            String email = scanner.nextLine();
            if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return email;
            } else {
                System.out.println("Error: Invalid email format. Please try again.");
            }
        }
    }

    private static String getValidPhone(Scanner scanner) {
        while (true) {
            System.out.print("Instructor Phone (10 digits): ");
            String phone = scanner.nextLine();
            if (phone != null && phone.matches("\\d{10}")) {
                return phone;
            } else {
                System.out.println("Error: Phone must be exactly 10 digits. Please try again.");
            }
        }
    }

    private static String getValidStudentName(Scanner scanner) {
        while (true) {
            System.out.print("Student Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Student name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidStudentID(Scanner scanner) {
        while (true) {
            System.out.print("Student ID: ");
            String id = scanner.nextLine();
            if (id != null && !id.trim().isEmpty()) {
                return id;
            } else {
                System.out.println("Error: Student ID cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidAge(Scanner scanner) {
        while (true) {
            System.out.print("Student Age: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                scanner.nextLine(); 
                if (age > 0) {
                    return age;
                } else {
                    System.out.println("Error: Age must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidTopic(Scanner scanner) {
        while (true) {
            System.out.print("Session Topic: ");
            String topic = scanner.nextLine();
            if (topic != null && !topic.trim().isEmpty()) {
                return topic;
            } else {
                System.out.println("Error: Session topic cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidAttendanceStudentID(Scanner scanner) {
        while (true) {
            System.out.print("Attendance Student ID: ");
            String id = scanner.nextLine();
            if (id != null && !id.trim().isEmpty()) {
                return id;
            } else {
                System.out.println("Error: Attendance student ID cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidSessionID(Scanner scanner) {
        while (true) {
            System.out.print("Session ID: ");
            String id = scanner.nextLine();
            if (id != null && !id.trim().isEmpty()) {
                return id;
            } else {
                System.out.println("Error: Session ID cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidStatus(Scanner scanner) {
        while (true) {
            System.out.print("Attendance Status (Present/Absent): ");
            String status = scanner.nextLine();
            if (status != null && (status.equals("Present") || status.equals("Absent"))) {
                return status;
            } else {
                System.out.println("Error: Status must be 'Present' or 'Absent'. Please try again.");
            }
        }
    }

    private static String getValidReason(Scanner scanner) {
        while (true) {
            System.out.print("Leave Reason: ");
            String reason = scanner.nextLine();
            if (reason != null && !reason.trim().isEmpty()) {
                return reason;
            } else {
                System.out.println("Error: Leave reason cannot be empty. Please try again.");
            }
        }
    }

    private static boolean getValidApproved(Scanner scanner) {
        while (true) {
            System.out.print("Leave Approved (true/false): ");
            String input = scanner.nextLine();
            if (input != null && (input.equals("true") || input.equals("false"))) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("Error: Please enter 'true' or 'false'. Please try again.");
            }
        }
    }

    private static int getValidTotalPresent(Scanner scanner) {
        while (true) {
            System.out.print("Total Present: ");
            if (scanner.hasNextInt()) {
                int present = scanner.nextInt();
                scanner.nextLine(); 
                if (present >= 0) {
                    return present;
                } else {
                    System.out.println("Error: Total present cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static int getValidTotalAbsent(Scanner scanner) {
        while (true) {
            System.out.print("Total Absent: ");
            if (scanner.hasNextInt()) {
                int absent = scanner.nextInt();
                scanner.nextLine(); 
                if (absent >= 0) {
                    return absent;
                } else {
                    System.out.println("Error: Total absent cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }
}