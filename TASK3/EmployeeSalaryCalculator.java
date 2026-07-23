import java.util.function.Function;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

    }

    static int calculateNetSalary() {
        String employeename;
        int basicsalary=0;
        int Bonusamount=0;
        int Deductionamount=0;
        int Netsalary;
        String salarystatus;


        Netsalary = basicsalary + Bonusamount - Deductionamount;
        return Netsalary;

    }


    static void checkSalaryStatus() {
        int salary=0;
        if (salary < 500) {
            System.out.println("Low Salary ");
        }
        if (500 < salary && salary < 1500) {
            System.out.println(" Medium Salary  ");
        }
        if (salary > 1500) {
            System.out.println("  High Salary  \n  ");
        }


    }

    static void displaySalaryDetails() {
        System.out.println("employeename");
        System.out.println("basicsalary");
        System.out.println("Bonusamount");
        System.out.println("Deductionamount");
        System.out.println("Netsalary");
        System.out.println("salarystatus");
    }
}

