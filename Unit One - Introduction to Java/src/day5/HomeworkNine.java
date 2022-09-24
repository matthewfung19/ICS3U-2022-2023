package day5;

import java.util.Scanner;

public class HomeworkNine {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Input number of sales: ");
        int num1= in.nextInt();
        double payout= num1*0.27;

        System.out.println("The amount due is: $" + payout);
        in.close();
    }
}
