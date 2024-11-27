public class Visitor extends Person {
    private String ticketTimeSlot; // Ticket period
    private String ticketID; // Ticket ID

    public Visitor() {
        super();
    }

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
