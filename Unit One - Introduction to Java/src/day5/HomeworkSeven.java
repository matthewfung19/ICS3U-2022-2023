package day5;

import java.util.Scanner;

public class HomeworkSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature(F): ");
        int num1= in.nextInt();

        double conversion= (num1-32.0)*(5.0/9.0);

        System.out.println(num1 + "F is equal to " + conversion + "C");

        in.close();
    }
}
