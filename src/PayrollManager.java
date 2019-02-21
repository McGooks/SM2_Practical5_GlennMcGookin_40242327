public class PayrollManager {

    final static int HOURS_PER_WEEK = 35;
    final static int MAX_ARRAY = 6;
    public static Employee[] employees = new Employee[MAX_ARRAY];

    public static void main(String[] args) {

        Employee porter1 =  new Porter("Invana","Patient",10.50,"Royal");
        Employee porter2 = new Porter("Amanda","Pushabed",10.50,"BCH");
        Employee surgeon1 = new Surgeon("Jack","Ripper", 55.25,"Renal",650.00);
        Employee surgeon2 = new Surgeon("Edward","Lister",55.25,"Vascular",850.00);
        Employee pharmacist1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.0);


        addEmployeeToList(porter1);
        addEmployeeToList(porter2);
        addEmployeeToList(surgeon1);
        addEmployeeToList(surgeon2);
        addEmployeeToList(pharmacist1);

        displayAllEmployees();

    }

    public static void addEmployeeToList(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if(employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }

    public static void displayAllEmployees(){
        System.out.println("Display all employees ________________________________");
        int totalEmployees = 0;
        System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type",
                "First name", "Last name", "Rate", "Other");
        for(Employee e: employees){
            if (e != null){
                e.displayAll();
                totalEmployees++;
            } else {
                break;
            }
        }
        System.out.println("Total Employees in system: " + totalEmployees);
        System.out.println("_______________________________________________________");

    }

    public static void processWeeklyPayroll(){
        for(Employee e : employees){
            if (e != null){
                e.calculateWeeklySalary(HOURS_PER_WEEK);
            }
        }

    }
}
