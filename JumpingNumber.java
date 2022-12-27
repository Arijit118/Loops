package Loops;

import java.util.*;

public class JumpingNumber {
    public static void checkJumpingNumber(int n) {
        int lastDigit, check, temp;
        for (int i = 0; i <= n; i++) {
            if (i < 10) {
                System.out.print(i + " ");
                continue;
            }
            check = 1;
            temp = i;
            lastDigit = i % 10;
            temp /= 10;
            while (temp != 0) {
                if (Math.abs(lastDigit - temp % 10) != 1) {
                    check = 0;
                    break;
                }
                lastDigit = temp % 10;
                temp /= 10;
            }

            if (check != 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkJumpingNumber(n);
    }
}
