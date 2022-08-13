package Loops;

public class PrintReverseOfNumber {
    public static void main(String args[]) {
        int n = 17899;
        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
