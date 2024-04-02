package JavaOne;

import java.util.Scanner;

public class MethodsExercise {
////------------------------------------------------------------------ SIMPLE MATH
    /*Basic Arithmetic
Create four separate methods. Each will perform an arithmetic operation:
- Addition
- Subtraction
- Multiplication
- Division
Each function needs to take two parameters/arguments so that the operation can be performed.
Test your methods and verify the output.
Add a - Modulus method that finds the modulus of two numbers.
Food for thought: What happens if we try to divide by zero? What should happen?*/
    // public static int adding(int numb1, int numb2) {
    //     return numb1 + numb2;
    // }
    // public static int subtracting(int numb1, int numb2) {
    //     return numb1 - numb2;
    // }
    // public static int multiplying(int numb1, int numb2) {
    //     return numb1 * numb2;
    // }
    // public static double dividing(double numb1, double numb2) {
    //     if (numb1 == 0 | numb2 == 0) {
    //         throw new IllegalArgumentException("cannot divide by zero");
    //     } else
    //     return numb1 / numb2;
    // }
    // public static double modulus(double numb1, double numb2) {
    //     return numb1 % numb2;
    // }
////------------------------------------------------------------------ GETINTEGER
        /*Create a method that validates that user input is in a certain range and returns 
        that input as an integer if it is within the given range. If not, prompt the user to input their number 
        again until the input is within range.
The method signature should look like this:
public static int getInteger(int min, int max);
and is used like this:
System.out.print("Enter a number between 1 and 10: ");
int userInput = getInteger(1, 10);
If the input is invalid, prompt the user again.
Hint: recursion might be helpful here!*/
        // public static void getInteger() {
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.print("Enter a number from 1 - 10: ");
        //     if (scanner.hasNextInt()) {
        //         int input = scanner.nextInt();
        //         if (input < 1 | input > 10) {
        //             System.out.print("That is not a number from 1 - 10. ");
        //             getInteger();
        //         } else {
        //             System.out.println("This number is within the accepted range");
        //         }
        //     } else {
        //         System.out.println("Invalid input. Enter a numerical value from 1 - 10.");
        //         scanner.next();
        //         getInteger();
        //     }
        //  scanner.close();
        // }
////---------------------------------------------------------------- FACTORIAL
/*Calculate the factorial of a number.
Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.
Factorials are denoted by the exclamation point (n!). Ex:
1! = 1               = 1
2! = 1 x 2           = 2
3! = 1 x 2 x 3       = 6
4! = 1 x 2 x 3 x 4   = 24*/
public static void factor() {
    boolean keepGoing = true;

    while (keepGoing) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-10");

        if (scanner.hasNextLong()) {
            long input = scanner.nextLong();
            if (input < 1 || input > 10) {
                System.out.println("That is not a numerical value from 1 - 10");
                scanner.next(); // Clear the invalid input
            } else {
                long factorial = 1;
                for (long i = 1; i <= input; i++) {
                    factorial *= i;
                }
                System.out.println(input + "! = " + factorial);
            }
        } else {
            System.out.println("Invalid input. Enter a numerical value from 1 - 10.");
            scanner.next(); // Clear the invalid input
        }

        System.out.println("Do you wish to continue? [y/n]");
        String choice = scanner.next();
        keepGoing = choice.equalsIgnoreCase("y");
        scanner.close();
        scanner.nextLine(); 
    }
}



//------------------------------------------------------------------ MAIN
    public static void main(String[] args) {
        // System.out.println(adding(1, 3));
        // System.out.println(subtracting(5, 6));
        // System.out.println(multiplying(3, 2));
        // System.out.println(dividing(9, 3));
        // System.out.println(modulus(7, 4));
        // getInteger();
        factor();
    }
}
