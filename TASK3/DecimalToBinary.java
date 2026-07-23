public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Integer number=25;
        Integer unchangenumber = 25;
        String binary = "";
        Integer reminder;

        while (number!=0){
            reminder = number;
            binary = reminder + binary;
            number = number/2;

        }

        IO.println("decimal number = " +unchangenumber);
        IO.println("Binary number = " + binary);


    }
}
