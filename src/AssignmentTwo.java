public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("Theme Park Ride Management System!");
    }

    public void partThree() {
        // Create an employee object
        Employee operator = new Employee("John", 35, "Male", "123-456-7890", "Ride Operator", 5);
    
        // Create a ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 5, operator);
    
        // Create some visitor objects
        Visitor visitor1 = new Visitor("Alice", 25, "Female", "234-567-8901", "Morning", "V001");
        Visitor visitor2 = new Visitor("Bob", 30, "Male", "345-678-9012", "Afternoon", "V002");
        Visitor visitor3 = new Visitor("Charlie", 22, "Male", "456-789-0123", "Morning", "V003");
        Visitor visitor4 = new Visitor("Diana", 28, "Female", "567-890-1234", "Evening", "V004");
        Visitor visitor5 = new Visitor("Eva", 27, "Female", "678-901-2345", "Afternoon", "V005");
    
        // Add visitors to queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
    
        // Print visitors in the current queue
        rollerCoaster.printQueue();
    
        // Remove a visitor
        rollerCoaster.removeVisitorFromQueue(visitor3);
    
        // Print the updated queue
        rollerCoaster.printQueue();
    }
    
    public static void partFourA() {
        // Create a Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 4, new Employee("Alice", 30, "Female", "1234567890", "Operator", 5));

        // Add 5 visitors to the queue
        rollerCoaster.addVisitorToQueue(new Visitor("John", 25, "Male", "9876543210", "12:00 PM", "T001"));
        rollerCoaster.addVisitorToQueue(new Visitor("Sarah", 30, "Female", "1112223333", "12:30 PM", "T002"));
        rollerCoaster.addVisitorToQueue(new Visitor("David", 22, "Male", "4445556666", "01:00 PM", "T003"));
        rollerCoaster.addVisitorToQueue(new Visitor("Emily", 28, "Female", "7778889999", "01:30 PM", "T004"));
        rollerCoaster.addVisitorToQueue(new Visitor("James", 35, "Male", "0001112222", "02:00 PM", "T005"));

        // Run a ride cycle
        rollerCoaster.runOneCycle();

        // Check if a visitor has taken the ride
        Visitor visitorToCheck = new Visitor("Sarah", 30, "Female", "1112223333", "12:30 PM", "T002");
        System.out.println("Visitor in history: " + rollerCoaster.checkVisitorFromHistory(visitorToCheck));

        // Print number of visitors
        System.out.println("Number of visitors: " + rollerCoaster.numberOfVisitors());

        // Print ride history
        rollerCoaster.printRideHistory();
    }

    public static void partFourB() {
        // Create a Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 4, new Employee("Alice", 30, "Female", "1234567890", "Operator", 5));

        // Add 5 visitors to the queue
        rollerCoaster.addVisitorToQueue(new Visitor("John", 25, "Male", "9876543210", "12:00 PM", "T001"));
        rollerCoaster.addVisitorToQueue(new Visitor("Sarah", 30, "Female", "1112223333", "12:30 PM", "T002"));
        rollerCoaster.addVisitorToQueue(new Visitor("David", 22, "Male", "4445556666", "01:00 PM", "T003"));
        rollerCoaster.addVisitorToQueue(new Visitor("Emily", 28, "Female", "7778889999", "01:30 PM", "T004"));
        rollerCoaster.addVisitorToQueue(new Visitor("James", 35, "Male", "0001112222", "02:00 PM", "T005"));

        // Run a ride cycle
        rollerCoaster.runOneCycle();

        // Print visitors before sorting
        System.out.println("Visitors before sorting:");
        rollerCoaster.printRideHistory();

        // Sort the visitors
        rollerCoaster.sortVisitors();

        // Print visitors after sorting
        System.out.println("Visitors after sorting:");
        rollerCoaster.printRideHistory();
    }

    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}
