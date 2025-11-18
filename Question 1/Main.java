import java.util.*;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Elements: ");
        int n = sc.nextInt();

        TreeSet<Integer> numbers = new TreeSet<Integer>();

        for(int i = 0; i < n; i++){
            System.out.printf("Enter Element %d : ", i+1);
            numbers.add(sc.nextInt());
        }

        System.out.print("Elements (Ascending Order): ");

        for(Integer i : numbers){
            System.out.printf("%d ", i);
        }

    }
}
