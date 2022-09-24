package day5;

import java.util.Scanner;

public class HomeworkTen {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Input the length and width of the rectange (m): ");
        int num1= in.nextInt();
        int num2= in.nextInt();

        double perimeter = (2*num1)+(2*num2);
        double area = num1*num2;

        System.out.println("The area of the rectangle is: " + area + "m^2");
        System.out.println("The perimeter of the rectange is: " + perimeter + "m");
        in.close();
    }
}
