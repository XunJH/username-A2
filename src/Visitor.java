public class Visitor extends Person {
    private String ticketTimeSlot; 
    private String ticketID;     

    // Default constructor
    public Visitor() {
        super(); 
    }

    // Take parameter construction method
    public Visitor(String name, int age, String gender, String phoneNumber, String ticketTimeSlot, String ticketID) {
        super(name, age, gender, phoneNumber);
        this.ticketTimeSlot = ticketTimeSlot;
        this.ticketID = ticketID;
    }

    // Getters and Setters
    public String getTicketTimeSlot() { return ticketTimeSlot; }
    public void setTicketTimeSlot(String ticketTimeSlot) { this.ticketTimeSlot = ticketTimeSlot; }

    public String getTicketID() { return ticketID; }
    public void setTicketID(String ticketID) { this.ticketID = ticketID; }
}