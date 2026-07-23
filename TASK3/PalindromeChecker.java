public class PalindromeChecker
{
    public static void main(String[] args)
    {
        int number=1221;
        int originalNumber=number;
        int reversedNumber=0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;

            if (reversedNumber == number) {
                System.out.println(number);
            }

        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }

        }



