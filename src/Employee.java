public class Employee extends Person {
    private String position; // Position
    private int workingYears; // Working years

    public Employee() {
        super();
    }

    public Employee(String name, int age, String gender, String phoneNumber, String position, int workingYears) {
        super(name, age, gender, phoneNumber);
        this.position = position;
        this.workingYears = workingYears;
    }

    // Getters and Setters
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getWorkingYears() { return workingYears; }
    public void setWorkingYears(int workingYears) { this.workingYears = workingYears; }
}
