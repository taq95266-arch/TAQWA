public class FibonacciSequance {
    public  static void main(String[] args) {
        Integer count=15;
        Integer first=0;
        Integer second=1;
        Integer next=first+second;
        IO.print(first+" "+second+" "+next);

        for (int i=1;i<=count;i++){
            next=first+second;
            first=second;
            second=next;
            IO.print(next+" ");
        }
    }
}
