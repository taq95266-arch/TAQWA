import java.util.Scanner;

public class TrapezoidCalculator {
    public static void main(String[] args) {
        double height = 0;
        double length = 0;
        double base1 = 0;
        double base2 = 0;
        double leg1 = 0;
        double leg2 = 0;
        double area;
        double Perimeter = 0;

        Scanner trapezoid = new Scanner(System.in);
        System.out.println("ENTER triangle's base OF triangl ");
        base1 = trapezoid.nextInt();

        Scanner trapezoid1 = new Scanner(System.in);
        System.out.println("ENTER height OF triangl ");
        base2 = trapezoid.nextInt();

        Scanner trapezoid2 = new Scanner(System.in);
        System.out.println("ENTER lengths OF triangl ");
        height = trapezoid.nextInt();

        Scanner trapezoid3 = new Scanner(System.in);
        System.out.println("ENTER triangle's base OF triangl ");
        leg1 = trapezoid.nextInt();

        Scanner trapezoid4 = new Scanner(System.in);
        System.out.println("ENTER triangle's base OF triangl ");
        leg2 = trapezoid.nextInt();

        Scanner trapezoid5 = new Scanner(System.in);
        System.out.println("ENTER RADIUS OF trapezoid ");
        length = trapezoid.nextInt();

        if (length <= 0) {
            System.out.println("Invalid input. All measurements must be greater than zero.");

        } else {
            area = ((base1 + base2) * height) / 2;
            Perimeter = base1 + base2 + leg1 + leg2;


            if (Perimeter < 30) {
                System.out.println("Small Trapezoid  ");
            }
            if (Perimeter > 30 && Perimeter < 60) {
                System.out.println(" Medium Trapezoid   ");
            }
            if (Perimeter > 60) {
                System.out.println(" Large Trapezoid   ");
            }
        }
    }
}