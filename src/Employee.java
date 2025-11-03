public abstract class Employee {
    String  employeeId;
    String  name;
    double salary;
    String department;

    public Employee(String employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public abstract void displayDetails();

    public double computeCompensation(double bonusMultiplier){
        return salary + (salary*bonusMultiplier);
    }
}
