public class Manager extends Employee{
    int teamSize;
    String project;

    public Manager(String employeeId, String name, double salary, String department, int teamSize, String project) {
        super(employeeId, name, salary, department);
        this.teamSize = teamSize;
        this.project = project;
    }
    public void displayDetails(){
        System.out.println("==DISPLAYING MANAGER INFORMATION==");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);

        double performance = computeCompensation(0.15);

        System.out.println("Annual Bonus: " + performance);
        System.out.println();
    }
}
