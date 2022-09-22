package day5;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter product price: ");
        int num1= in.nextInt();

        double total = num1 * 1.055;

        System.out.println("The Total Price is: $" + total);

        in.close();
    }
}
