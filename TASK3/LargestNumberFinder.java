import java.util.ArrayList;

public class LargestNumberFinder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(33);
        list.add(44);
        list.add(53);
        list.add(89);
        list.add(78);

        System.out.println(" new ArrayList");

        int number = 0;
        int largestNumber = 0;
        int count;
        largestNumber = list.get(0);

        for (Integer num : list) {
            if (num > largestNumber)
                largestNumber = num;
            System.out.print(num + "  ");


        }
        System.out.println("\nlargestNumber: " + largestNumber);
    }
}
