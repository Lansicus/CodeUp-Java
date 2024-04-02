package JavaOne;

import java.util.Scanner;

public class MethodsExercise {
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
    ////--------------------------------------
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
        public static void getInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number from 1 - 10: ");
            int input = scanner.nextInt();
            if (input < 1 | input > 10) {
                System.out.print("That is not a number from 1 - 10. ");
                getInteger();
            } else if (input > 0 && input < 11) {
                System.out.println("This number is within the accepted range");
            } scanner.close();
        }
    public static void main(String[] args) {
        // System.out.println(adding(1, 3));
        // System.out.println(subtracting(5, 6));
        // System.out.println(multiplying(3, 2));
        // System.out.println(dividing(9, 3));
        // System.out.println(modulus(7, 4));
        getInteger();
    }
}
