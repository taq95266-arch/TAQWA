import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
       double grade1=12.3;
       double grade2=5.3;
       double grade3=20.7;
       double average;
       String status;


        average=(grade1+grade2+grade3)/3;


      if (average >= 90)
           System.out.println("Excellent");

        else if (average >= 75 && average < 89)
        System.out.println("good");

       else if (average >= 60 && average < 74)
            System.out.println("pass");

        else
            System.out.println("fail");

            System.out.println("grade1  " + grade1 + "grade2  " + grade2 + "grade3  " + grade3);
            System.out.println("average  " + average);


    }
}
