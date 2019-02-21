public abstract class Employee {

    private String firstName;
    private String lastName;
    private double baseRate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public Employee(String firstName, String lastName, double baseRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseRate = baseRate;
    }

    public Employee(){

    }

    public double calculateWeeklySalary(double hours){
        return hours * getBaseRate();
    }

    public void displayAll() {
        System.out.printf("[%-10s] %-20s %-20s %-6s %s \n",this.getFirstName(),this.getLastName(),this.getBaseRate());
    }
}
