import java.util.Scanner;

public class CircleCalculator {
    public static void main (String [] args){
        int radius=0;
        double by=3.14;
        String classification;

        Scanner RADIUS=new Scanner(System.in);
        System.out.println("ENTER RADIUS OF CIRCLE ");
        radius=RADIUS.nextInt();

        if (radius <= 0){
            System.out.println("Invalid radius");

        }
        else if (radius >0){
            System.out.println("allow radius");

           Double  area = 2+by* Math.pow(radius, 2);
           Double circumference =2*by*radius;

            if (radius <5){
                System.out.println("Small Circle ");

            }
            else if (5 <radius && radius >15 ){
                System.out.println("Medium Circle ");
            }
            else if (radius<15){
                System.out.println("Large Circle  ");
            }
        }


    }
}
