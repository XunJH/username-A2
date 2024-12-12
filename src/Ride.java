import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private int numOfCycles;  
    private Employee employeeInCharge;
    private Queue<Visitor> queue;  
    private LinkedList<Visitor> rideHistory; 

    // Add visitors to queue
    public Ride() {
        queue = new LinkedList<>();
        rideHistory = new LinkedList<>();
        numOfCycles = 0;  
    }

    // Construction method with parameters
    public Ride(String rideName, int maxRiders, Employee employeeInCharge) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.employeeInCharge = employeeInCharge;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // Getters and Setters
    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public int getMaxRiders() { return maxRiders; }
    public void setMaxRiders(int maxRiders) { this.maxRiders = maxRiders; }

    public int getNumOfCycles() { return numOfCycles; }  // Get the number of cycles run
    public void setNumOfCycles(int numOfCycles) { this.numOfCycles = numOfCycles; }

    public Employee getEmployeeInCharge() { return employeeInCharge; }
    public void setEmployeeInCharge(Employee employeeInCharge) { this.employeeInCharge = employeeInCharge; }

    // Implement the RideInterface interface
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.offer(visitor);  
        System.out.println("Visitor " + visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " removed from the queue.");
        } else {
            System.out.println("Visitor not found in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Visitors in the queue:");
            for (Visitor v : queue) {
                System.out.println(v.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (employeeInCharge == null) {
            System.out.println("No ride operator assigned. Cannot run the cycle.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue. Cannot run the cycle.");
            return;
        }

        // Take a minimum of maxRiders or the size of the queue visitors
        int riders = Math.min(maxRiders, queue.size());
        System.out.println("Running the ride cycle with " + riders + " visitors...");
        for (int i = 0; i < riders; i++) {
            Visitor visitor = queue.poll();  // Remove visitor from the queue
            addVisitorToHistory(visitor);    // Add visitor to ride history
            System.out.println(visitor.getName() + " has taken the ride.");
        }

        numOfCycles++;  // Increment the cycle count after each run
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride yet.");
        } else {
            System.out.println("Visitors who have taken the ride:");
            for (Visitor v : rideHistory) {
                System.out.println(v.getName());
            }
        }
    }
    
    public void sortVisitors() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Visitors have been sorted.");
    }
}
