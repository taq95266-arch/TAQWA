import java.util.ArrayList;

public class EvenOddCounter {
    public static void main(String[] args) {
        Integer star;
        Integer end;
        Integer evenCount=5;
        Integer oddCount=5;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(22);
        list.add(34);
        list.add(53);
        list.add(89);
        list.add(78);

        System.out.println(" new ArrayList");
        for (Integer num : list) {
            if(num%2==0){
                System.out.println("evenNumber:"+num);
            }
            else{
                System.out.println("oddNumber:"+num);
            }
                System.out.println(oddCount);
                System.out.println(evenCount);
        }

    }
}
