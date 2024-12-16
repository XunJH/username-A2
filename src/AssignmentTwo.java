public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("Theme Park Ride Management System!");

        partThree();  

        partFourA();

        partFourB();

        partFive();

        partSix();

        partSeven();
    }

    public static void partThree() {
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

    public static void partFive() {
        // Create a Ride object
        Employee operator = new Employee("John", 35, "Male", "123-456-7890", "Ride Operator", 5);
        Ride rollerCoaster = new Ride("Roller Coaster", 4, operator);
    
        // Add 10 visitors to the queue
        rollerCoaster.addVisitorToQueue(new Visitor("John", 25, "Male", "9876543210", "12:00 PM", "T001"));
        rollerCoaster.addVisitorToQueue(new Visitor("Sarah", 30, "Female", "1112223333", "12:30 PM", "T002"));
        rollerCoaster.addVisitorToQueue(new Visitor("David", 22, "Male", "4445556666", "01:00 PM", "T003"));
        rollerCoaster.addVisitorToQueue(new Visitor("Emily", 28, "Female", "7778889999", "01:30 PM", "T004"));
        rollerCoaster.addVisitorToQueue(new Visitor("James", 35, "Male", "0001112222", "02:00 PM", "T005"));
        rollerCoaster.addVisitorToQueue(new Visitor("Alice", 29, "Female", "2223334444", "02:30 PM", "T006"));
        rollerCoaster.addVisitorToQueue(new Visitor("Bob", 27, "Male", "5556667777", "03:00 PM", "T007"));
        rollerCoaster.addVisitorToQueue(new Visitor("Charlie", 32, "Male", "8889990000", "03:30 PM", "T008"));
        rollerCoaster.addVisitorToQueue(new Visitor("Diana", 28, "Female", "1113334444", "04:00 PM", "T009"));
        rollerCoaster.addVisitorToQueue(new Visitor("Eva", 27, "Female", "4447778888", "04:30 PM", "T010"));
    
        // Print all visitors in the queue
        rollerCoaster.printQueue();
    
        // Run one cycle
        rollerCoaster.runOneCycle();
    
        // Print all visitors in the queue after one cycle
        System.out.println("After one cycle:");
        rollerCoaster.printQueue();
    
        // Print all visitors in the collection (ride history)
        System.out.println("Visitors who have taken the ride:");
        rollerCoaster.printRideHistory();
    }
    public static void partSix() {
        // Create an Employee object to operate the ride
        Employee operator = new Employee("John", 35, "Male", "123-456-7890", "Ride Operator", 5);
        
        // Create a new Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 4, operator);
    
        // Add some visitors to the ride (i.e., the ride history)
        rollerCoaster.addVisitorToHistory(new Visitor("John", 25, "Male", "9876543210", "12:00 PM", "T001"));
        rollerCoaster.addVisitorToHistory(new Visitor("Sarah", 30, "Female", "1112223333", "12:30 PM", "T002"));
        rollerCoaster.addVisitorToHistory(new Visitor("David", 22, "Male", "4445556666", "01:00 PM", "T003"));
        rollerCoaster.addVisitorToHistory(new Visitor("Emily", 28, "Female", "7778889999", "01:30 PM", "T004"));
        rollerCoaster.addVisitorToHistory(new Visitor("James", 35, "Male", "0001112222", "02:00 PM", "T005"));
    
        // Export the visitors' ride history to a file
        rollerCoaster.exportRideHistory("ride_history.txt");
    }
    
    public static void partSeven() {
        // Create a new Ride instance
        Employee operator = new Employee("Alice", 30, "Female", "1234567890", "Operator", 5);
        Ride rollerCoaster = new Ride("Roller Coaster", 4, operator);
        
        // Import visitors from the file
        rollerCoaster.importRideHistory("ride_history.txt"); 
        
        // Print the number of visitors in the LinkedList (ride history)
        System.out.println("Number of visitors imported: " + rollerCoaster.numberOfVisitors());
        
        // Print the details of all visitors in the LinkedList
        System.out.println("Visitors who have taken the ride:");
        rollerCoaster.printRideHistory();
    }
}
