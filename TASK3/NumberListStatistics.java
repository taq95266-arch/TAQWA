
import java.util.ArrayList;

public class NumberListStatistics {
    public static void main ( String [] args){
        Integer count=0;
        Integer sumnumber=0;
        Integer evennumber=0;
        Integer oddnumber=0;
        Integer positivenumber=0;
        Integer negativenumber=0;
        Integer Largestnumber=0;
        Integer Smallestnumber=0;
        ArrayList <Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(-27);
        numbers.add(0);
        numbers.add(2);
        numbers.add(8);
        numbers.add(9);
        numbers.add(45);
        numbers.add(67);
        numbers.add(9);
        numbers.add(-34);
        numbers.add(38);
        numbers.add(23);
        numbers.add(70);
        numbers.add(-78);


        Largestnumber = numbers.get(0);
        Smallestnumber = numbers.get(0);

        for (Integer number :numbers) {
            System.out.println(number);

            if (number % 2 == 0) {
                evennumber += 1;
            } else {
                oddnumber += 1;
            }

            if (number > 0) {
                positivenumber += 1;
            } else if (number < 0) {
                negativenumber += 1;
            }

            if (number > Largestnumber) {
                Largestnumber = number;
            } else if (number < Smallestnumber) {
                Smallestnumber = number;
            }
        }


                System.out.println("Total Sum: " + sumnumber);
                System.out.println("Even Numbers : " + evennumber);
                System.out.println("Odd Numbers : " + oddnumber);
                System.out.println("Positive Numbers : " + positivenumber);
                System.out.println("Negative Numbers : " + negativenumber);
                System.out.println("Largest Number: " + Largestnumber);
                System.out.println("Smallest Number: " + Smallestnumber);


            }
        }


