package Loops;

import java.util.*;

public class LoopQuestionTwo {
    public static void main(String args[]) {
        /*
         * Write a program that reads a set of integers,
         * and then prints the sum of the even and odd integers.
         */
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter a Number: ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("If you want to continue press 1 or for discard press 0. :");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of all entered even number is : " + evenSum);
        System.out.println("Sum of all entered odd number is : " + oddSum);
    }
}
