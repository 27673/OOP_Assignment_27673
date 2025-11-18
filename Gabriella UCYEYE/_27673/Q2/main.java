package _27673.Q2;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_27673 - Flight Booking System");
        System.out.println("===============================");

        
        int id = getValidId(scanner);
        String airportName = getValidAirportName(scanner);
        String airportCode = getValidAirportCode(scanner);
        String location = getValidLocation(scanner);
        String airlineName = getValidAirlineName(scanner);
        String airlineCode = getValidAirlineCode(scanner);
        String contactEmail = getValidContactEmail(scanner);
        String flightNumber = getValidFlightNumber(scanner);
        String departure = getValidDeparture(scanner);
        String destination = getValidDestination(scanner);
        double baseFare = getValidBaseFare(scanner);
        String pilotName = getValidPilotName(scanner);
        String licenseNumber = getValidLicenseNumber(scanner);
        int experienceYears = getValidExperienceYears(scanner);
        String crewName = getValidCrewName(scanner);
        String role = getValidRole(scanner);
        String shift = getValidShift(scanner);
        String passengerName = getValidPassengerName(scanner);
        int age = getValidAge(scanner);
        String gender = getValidGender(scanner);
        String contact = getValidContact(scanner);
        String seatNumber = getValidSeatNumber(scanner);
        String travelClass = getValidTravelClass(scanner);
        String paymentMethod = getValidPaymentMethod(scanner);
        double amountPaid = getValidAmountPaid(scanner);
        String ticketNumber = getValidTicketNumber(scanner);

        
        Ticket ticket = new Ticket(
                id, new Date(), new Date(),
                airportName, airportCode, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                new Date(), seatNumber, travelClass,
                new Date(), paymentMethod, amountPaid,
                ticketNumber, new Date()
        );

        
        System.out.println("\n" + ticket.generateTicket());

        
        System.out.println("\n=== ALL INSERTED DATA === 27673");
        System.out.println("ID: " + ticket.getId());
        System.out.println("Airport: " + ticket.getAirportName() + " (" + ticket.getCode() + ") - " + ticket.getLocation());
        System.out.println("Airline: " + ticket.getAirlineName() + " (" + ticket.getAirlineCode() + ") - " + ticket.getContactEmail());
        System.out.println("Flight: " + ticket.getFlightNumber() + " | " + ticket.getDeparture() + " to " + ticket.getDestination());
        System.out.println("Base Fare: $" + ticket.getBaseFare());
        System.out.println("Pilot: " + ticket.getPilotName() + " | License: " + ticket.getLicenseNumber() + " | Exp: " + ticket.getExperienceYears() + " years");
        System.out.println("Cabin Crew: " + ticket.getCrewName() + " | Role: " + ticket.getRole() + " | Shift: " + ticket.getShift());
        System.out.println("Passenger: " + ticket.getPassengerName() + " | Age: " + ticket.getAge() + " | Gender: " + ticket.getGender() + " | Contact: " + ticket.getContact());
        System.out.println("Booking: Seat " + ticket.getSeatNumber() + " | Class: " + ticket.getTravelClass());
        System.out.println("Payment: " + ticket.getPaymentMethod() + " | Amount: $" + ticket.getAmountPaid());
        System.out.println("Ticket: " + ticket.getTicketNumber() + " | Calculated Fare: $" + String.format("%.2f", ticket.calculateFare()));

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

    private static String getValidAirportName(Scanner scanner) {
        while (true) {
            System.out.print("Airport Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Airport name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidAirportCode(Scanner scanner) {
        while (true) {
            System.out.print("Airport Code (3 uppercase letters): ");
            String code = scanner.nextLine();
            if (code != null && code.matches("[A-Z]{3}")) {
                return code;
            } else {
                System.out.println("Error: Airport code must be exactly 3 uppercase letters. Please try again.");
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

    private static String getValidAirlineName(Scanner scanner) {
        while (true) {
            System.out.print("Airline Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Airline name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidAirlineCode(Scanner scanner) {
        while (true) {
            System.out.print("Airline Code (2-4 letters): ");
            String code = scanner.nextLine();
            if (code != null && code.length() >= 2 && code.length() <= 4) {
                return code;
            } else {
                System.out.println("Error: Airline code must be 2-4 letters. Please try again.");
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

    private static String getValidFlightNumber(Scanner scanner) {
        while (true) {
            System.out.print("Flight Number: ");
            String number = scanner.nextLine();
            if (number != null && !number.trim().isEmpty()) {
                return number;
            } else {
                System.out.println("Error: Flight number cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidDeparture(Scanner scanner) {
        while (true) {
            System.out.print("Departure City: ");
            String departure = scanner.nextLine();
            if (departure != null && !departure.trim().isEmpty()) {
                return departure;
            } else {
                System.out.println("Error: Departure cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidDestination(Scanner scanner) {
        while (true) {
            System.out.print("Destination City: ");
            String destination = scanner.nextLine();
            if (destination != null && !destination.trim().isEmpty()) {
                return destination;
            } else {
                System.out.println("Error: Destination cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidBaseFare(Scanner scanner) {
        while (true) {
            System.out.print("Base Fare: ");
            if (scanner.hasNextDouble()) {
                double fare = scanner.nextDouble();
                scanner.nextLine(); 
                if (fare > 0) {
                    return fare;
                } else {
                    System.out.println("Error: Base fare must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidPilotName(Scanner scanner) {
        while (true) {
            System.out.print("Pilot Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Pilot name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidLicenseNumber(Scanner scanner) {
        while (true) {
            System.out.print("License Number: ");
            String license = scanner.nextLine();
            if (license != null && !license.trim().isEmpty()) {
                return license;
            } else {
                System.out.println("Error: License number cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidExperienceYears(Scanner scanner) {
        while (true) {
            System.out.print("Experience Years: ");
            if (scanner.hasNextInt()) {
                int years = scanner.nextInt();
                scanner.nextLine(); 
                if (years >= 2) {
                    return years;
                } else {
                    System.out.println("Error: Experience years must be at least 2. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidCrewName(Scanner scanner) {
        while (true) {
            System.out.print("Cabin Crew Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Crew name cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidRole(Scanner scanner) {
        while (true) {
            System.out.print("Crew Role: ");
            String role = scanner.nextLine();
            if (role != null && !role.trim().isEmpty()) {
                return role;
            } else {
                System.out.println("Error: Role cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidShift(Scanner scanner) {
        while (true) {
            System.out.print("Shift (Day/Night): ");
            String shift = scanner.nextLine();
            if (shift != null && (shift.equals("Day") || shift.equals("Night"))) {
                return shift;
            } else {
                System.out.println("Error: Shift must be 'Day' or 'Night'. Please try again.");
            }
        }
    }

    private static String getValidPassengerName(Scanner scanner) {
        while (true) {
            System.out.print("Passenger Name: ");
            String name = scanner.nextLine();
            if (name != null && !name.trim().isEmpty()) {
                return name;
            } else {
                System.out.println("Error: Passenger name cannot be empty. Please try again.");
            }
        }
    }

    private static int getValidAge(Scanner scanner) {
        while (true) {
            System.out.print("Passenger Age: ");
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

    private static String getValidGender(Scanner scanner) {
        while (true) {
            System.out.print("Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            if (gender != null && (gender.equals("Male") || gender.equals("Female") || gender.equals("Other"))) {
                return gender;
            } else {
                System.out.println("Error: Gender must be 'Male', 'Female', or 'Other'. Please try again.");
            }
        }
    }

    private static String getValidContact(Scanner scanner) {
        while (true) {
            System.out.print("Contact: ");
            String contact = scanner.nextLine();
            if (contact != null && !contact.trim().isEmpty()) {
                return contact;
            } else {
                System.out.println("Error: Contact cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidSeatNumber(Scanner scanner) {
        while (true) {
            System.out.print("Seat Number: ");
            String seat = scanner.nextLine();
            if (seat != null && !seat.trim().isEmpty()) {
                return seat;
            } else {
                System.out.println("Error: Seat number cannot be empty. Please try again.");
            }
        }
    }

    private static String getValidTravelClass(Scanner scanner) {
        while (true) {
            System.out.print("Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();
            if (travelClass != null && (travelClass.equals("Economy") || travelClass.equals("Business") || travelClass.equals("First"))) {
                return travelClass;
            } else {
                System.out.println("Error: Travel class must be 'Economy', 'Business', or 'First'. Please try again.");
            }
        }
    }

    private static String getValidPaymentMethod(Scanner scanner) {
        while (true) {
            System.out.print("Payment Method: ");
            String method = scanner.nextLine();
            if (method != null && !method.trim().isEmpty()) {
                return method;
            } else {
                System.out.println("Error: Payment method cannot be empty. Please try again.");
            }
        }
    }

    private static double getValidAmountPaid(Scanner scanner) {
        while (true) {
            System.out.print("Amount Paid: ");
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                scanner.nextLine(); 
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Error: Amount paid must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getValidTicketNumber(Scanner scanner) {
        while (true) {
            System.out.print("Ticket Number: ");
            String number = scanner.nextLine();
            if (number != null && !number.trim().isEmpty()) {
                return number;
            } else {
                System.out.println("Error: Ticket number cannot be empty. Please try again.");
            }
        }
    }
}