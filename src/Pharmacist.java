public class Pharmacist extends Employee {
    private int grade;
    private double bonus;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
        super(firstName, lastName, baseRate);
        this.grade = grade;
        this.bonus = bonus;
    }

    public Pharmacist(int grade, double bonus) {
        this.grade = grade;
        this.bonus = bonus;
    }

    public Pharmacist(){

    }

    public double calculateWeeklySalary(double hours){
        return (hours * getBaseRate()) + bonus;
    }

    @Override
    public void displayAll() {
        System.out.printf("[%-10s] %-20s %-20s %-6s Grade: %d, Bonus: £%.2f \n","Pharmacist",getFirstName(),getLastName(), getBaseRate(),this.getGrade(),this.getBonus());
    }

}
