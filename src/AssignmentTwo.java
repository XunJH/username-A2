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
    
        // Prints visitors in the current queue
        rollerCoaster.printQueue();
    
        // Remove a visitor
        rollerCoaster.removeVisitorFromQueue(visitor3);
    
        // Print the updated queue
        rollerCoaster.printQueue();
    }
    
    public void partFourA() {}
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}
