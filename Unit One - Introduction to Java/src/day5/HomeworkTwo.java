package day5;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter length and width(ft): ");
        double num1= in.nextInt();
        double num2= in.nextInt();

        double perimeter = (num1*2) + (num2*2);
        double area = num1*num2;


        System.out.println("The Perimeter is: " + perimeter +"ft");
        System.out.println("The area is: " + area +"ft^2");

        in.close();
    }
}
