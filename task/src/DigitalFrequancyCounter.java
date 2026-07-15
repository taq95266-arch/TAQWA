public class DigitalFrequancyCounter {
    public static void main (String [] args){
        Integer Number=122333;
        Integer Numberchanged =122333;
        Integer targetNumber=3;
        Integer count=0;
        Integer digit=0;

        while (Number != 0){
            digit = Number%10;
            if (digit == targetNumber){
                count = count +1;
            }
            Number = Number/10;
        }
        IO.println("Number = " + Numberchanged);

        IO.println("taget = " +targetNumber);
        IO.println(" Frequency " +  count);
    }
}
