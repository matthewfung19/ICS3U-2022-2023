package day5;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the mass and speed of the following object: ");
        int num1= in.nextInt();
        int num2= in.nextInt();
        double mass= num1;
        double speed= num2;

        double Ke= 0.5*mass*(speed*speed);
        System.out.println("The kinetic energy of the object is: " + Ke);
        in.close();
    }
}
