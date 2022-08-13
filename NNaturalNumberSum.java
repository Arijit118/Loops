package Loops;
import java.util.*;
public class NNaturalNumberSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int counter = 1, sum = 0;
        while(counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of first " + n + " natural number is: " + sum);
    }
}
