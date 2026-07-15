public class ArmstrongNumberChecker {
    public static void main (String[] args){
        Integer number=153;
        Integer originalnumber=153;
        Integer numbercopy=153;
        Integer digit;
        Integer sum = 0;
        Integer count=0;

        while (number > 0){
            count=count+1;

           number = number / 10;
        }


        while (originalnumber  > 0){
            digit = originalnumber%10;

            sum += (int)(Math.pow(digit,count));
           // remove last number
            originalnumber = originalnumber/10;
        }

        if (numbercopy.equals(sum)){
           System.out.println(" the number is an Armstrong number.");
        }

    }
}
