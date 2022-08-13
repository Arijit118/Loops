package Loops;

public class LoopQuestionFive {
    public static void main(String args[]) {
        int i=0;
        for(i=0; i<=5; i++) {
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop: "+i);//Scope of variable i is only available in for loop 
    }
}
