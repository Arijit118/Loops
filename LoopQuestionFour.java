package Loops;
import java.util.*;
public class LoopQuestionFour {
    public static void main(String args[]) {
        /*
         * Write a program to print the multiplication table 
         * of a number N, entered by the user.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            int multiply = n * i;
            System.out.println(n + "*" + i + "=" + multiply);
        }
    }
}
