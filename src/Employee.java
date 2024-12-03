public class Employee extends Person {
    private String position;  
    private int yearsOfWork;  

    // Default constructor
    public Employee() {
        super(); 
    }

    // Take parameter construction method
    public Employee(String name, int age, String gender, String phoneNumber, String position, int yearsOfWork) {
        super(name, age, gender, phoneNumber);
        this.position = position;
        this.yearsOfWork = yearsOfWork;
    }

    // Getters and Setters
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getYearsOfWork() { return yearsOfWork; }
    public void setYearsOfWork(int yearsOfWork) { this.yearsOfWork = yearsOfWork; }
}

