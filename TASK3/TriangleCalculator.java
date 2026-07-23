import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        double height = 0;
        double lengths;
        double triangle = 0;
        double trianglesbase = 0;
        double area;
        double Perimeter = 0;


        Scanner TRIANGLE = new Scanner(System.in);
        System.out.println("ENTER triangle's base OF triangl ");
        triangle = TRIANGLE.nextInt();

        Scanner TRIANGLE1 = new Scanner(System.in);
        System.out.println("ENTER height OF triangl ");
        triangle = TRIANGLE.nextInt();

        Scanner TRIANGLE2 = new Scanner(System.in);
        System.out.println("ENTER lengths OF triangl ");
        triangle = TRIANGLE.nextInt();


        if (triangle <= 0) {
            System.out.println("y \"Invalid input. All values \n" +
                    "must be greater than zero.");
        }

        area = (trianglesbase * height) / 2;
        Perimeter = (side1 + side2 + side3);

        if (side1 == side2 && side2 == side3) {
            System.out.println(" Equilateral Triangle ");
        } else if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("  Isosceles Triangle   ");

        } else if (side1 == side2 || side2 == side3) {
            System.out.println(" Scalene Triangle  ");
        }

    }
}