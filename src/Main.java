//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("M001","LUMU", 500000, "Managerial", 20, "Ethenz");

        System.out.println("EMPLOYEE DETAILS");
        mgr.displayDetails();

        System.out.println();

        System.out.println("COMPENSATIONS");
        double managerAnnualBonus = mgr.computeCompensation(0.25);
        System.out.println("Manager Annual Bonus: " + managerAnnualBonus);

       
    }
}