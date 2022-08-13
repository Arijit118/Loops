package Loops;

import java.util.*;

public class CheckPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        if(n == 2) {
            System.out.println(n + " is a Prime number");
        } else {
            //for(int i=2; i<=n-1; i++) { //for optimization of code we can check i<= sqrt(n)
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            
            if(isPrime == true) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is not a Prime number.");
            }
        }
        
    }
}
