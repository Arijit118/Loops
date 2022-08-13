package Loops;
import java.util.*;
public class LoopQuestionThree {
    public static void main(String args[]) {
        /*
         * Write a program to find the factorial of any number entered by the user.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1;
        if(n == 0){
            System.out.println("Factorial of 0 is: " + 1);
            
        } else {
            for(int i=1; i<=n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
    }
}
