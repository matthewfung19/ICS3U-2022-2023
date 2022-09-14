package day3;

public class ExampleOne {
    public static void main(String[] args) {
        //variables allow us to store data/information
        //we must declare the variable and the type of data it will store

        //primitive data types
        //int -> integer (have no decimal portion)
        //double -> decimal numbers
        //boolean -> true / false

        //naming convention for variables (camelCase)

         // int age = 17.9; cannot convert a double to an int. 17.9 is a double and age
      // is an int
      int numberOfStudents = 13; // = assignment operator (it assigns a value to a variable)
      double averageAge = 18.3;

      System.out.println(numberOfStudents);
      System.out.println(averageAge);
      System.out.println(5 + 3);

      // good practice declare variables as you need them
      int numberOne = 10, numberTwo, numberThree; // you can declare multiple variables of the same type on the same line.

      numberTwo = 16;
      numberThree = 11;

      int sum = numberOne + numberTwo + numberThree;

      System.out.println("The sum is " + sum); // String concatenation

      // String concatenation is when I join something to a String using +

      int x = 7;
      int y = 6;

      sum = x + y;

      System.out.println(x + " + " + y + " = " + sum);

      System.out.println("text:" + 1 + 3);


    }

}
