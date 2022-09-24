package day5;

import java.util.Scanner;

public class HomeworkEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integar: ");
        double num1= in.nextInt();

        double square = num1*num1;
        double sqrt= Math.sqrt(num1);

        System.out.println("The square of " + num1 + " is: " + square);
        System.err.println("The square root of " + num1 + " is: " + sqrt);

        in.close();
    }
}
