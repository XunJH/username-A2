import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by ticketTimeSlot, if they are equal then compare by age
        int timeSlotComparison = v1.getTicketTimeSlot().compareTo(v2.getTicketTimeSlot());
        if (timeSlotComparison != 0) {
            return timeSlotComparison;
        } else {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
    }
}
