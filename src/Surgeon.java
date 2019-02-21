public class Surgeon extends Employee {
    private String specialistArea;
    private double consultationFee;

    public String getSpecialistArea() {
        return specialistArea;
    }

    public void setSpecialistArea(String specialistArea) {
        this.specialistArea = specialistArea;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
        super(firstName, lastName, baseRate);
        this.specialistArea = specialistArea;
        this.consultationFee = consultationFee;
    }

    public Surgeon(String specialistArea, double consultationFee) {
        this.specialistArea = specialistArea;
        this.consultationFee = consultationFee;
    }

    public Surgeon(){

    }

    public double calculateWeeklySalary(double hours){
        return (hours * getBaseRate()) + consultationFee;
    }

    @Override
    public void displayAll() {
        System.out.printf("[%-10s] %-20s %-20s %-6s Specailist Area: %s, Consultation Fee: £%.2f \n","Surgeon",this.getFirstName(),this.getLastName(),this.getBaseRate(),this.getSpecialistArea(), getConsultationFee());
    }
}
