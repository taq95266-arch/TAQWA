import java.util.Scanner;

public class digitCounter {
    public static void main(String[] args) {
        int number = 123456;
        int originalNumber = 123456;
        int count=0;

        while (number != 0) {
            number = number / 10;
            count = count + 1;
        }

        System.out.print("total number of digits is " + count);
    }
}

