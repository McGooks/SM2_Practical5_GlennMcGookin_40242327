public class Porter extends Employee {
    private String site;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Porter(String firstName, String lastName, double baseRate, String site) {
        super(firstName, lastName, baseRate);
        this.site = site;
    }

    public Porter(String site) {
        this.site = site;
    }

    public Porter(){

    }

    public double calculateWeeklySalary(double hours){
        return hours * getBaseRate();
    }

    @Override
    public void displayAll() {
        System.out.printf("[%-10s] %-20s %-20s %-6s Site: %s \n","Porter",this.getFirstName(),this.getLastName(),this.getBaseRate(),this.getSite());
    }


}
