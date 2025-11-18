package _27673.Q2;

import java.util.Date;

public class Ticket extends Payment {
    private String ticketNumber;
    private Date issueDate;

    public Ticket(int id, Date createDate, Date updateDate, String airportName, String code, String location,
            String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
            String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears,
            String crewName, String role, String shift, String passengerName, int age, String gender, String contact,
            Date bookingDate, String seatNumber, String travelClass, Date paymentDate, String paymentMethod,
            double amountPaid, String ticketNumber, Date issueDate) {
        super(id, createDate, updateDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName,
                role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate,
                paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    
    public double calculateFare() {
        double baseFare = getBaseFare();
        double taxes = baseFare * 0.15; 
        double discounts = 0.0;

        
        if (getTravelClass().equals("Business")) {
            discounts = baseFare * 0.10; 
        } else if (getTravelClass().equals("First")) {
            discounts = baseFare * 0.15; 
        }

        double finalFare = baseFare + taxes - discounts;
        return finalFare;
    }

    public String generateTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("_27673");

        ticket.append("\n=== FLIGHT TICKET === 27673");
        ticket.append("\nTicket Number: ").append(ticketNumber);
        ticket.append("\nIssue Date: ").append(issueDate);
        ticket.append("\nCalculated Fare: $").append(String.format("%.2f", calculateFare()));
        ticket.append("\n=================================");

        return ticket.toString();
    }
}