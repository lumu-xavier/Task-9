import java.sql.SQLOutput;

public class SalesPerson extends Employee {
    double salesTarget;
    String region;

    public SalesPerson(String employeeId, String name, double salary, String department, double salesTarget, String region) {
        super(employeeId, name, salary, department);
        this.salesTarget = salesTarget;
        this.region = region;
    }
    public void displayDetails(){
        System.out.println("==DISPLAYING SALES PERSON INFORMATION==");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("SalesTarget: " + salesTarget);
        System.out.println("Region: " + region);

        double Commission = computeCompensation(5);

        System.out.println("Commission: " + Commission);
    }
}
