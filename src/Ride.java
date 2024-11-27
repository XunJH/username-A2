import java.util.LinkedList;
import java.util.Queue;

public class Ride {
    private String rideName; // Name of amusement facilities
    private int maxRider; // Maximum number of passengers per ride
    private Employee operator; // operator
    private Queue<Visitor> visitorQueue; // Waiting queue

    public Ride() {
        visitorQueue = new LinkedList<>();
    }

    public Ride(String rideName, int maxRider, Employee operator) {
        this.rideName = rideName;
        this.maxRider = maxRider;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public int getMaxRider() { return maxRider; }
    public void setMaxRider(int maxRider) { this.maxRider = maxRider; }

    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }

    public Queue<Visitor> getVisitorQueue() { return visitorQueue; }
}
