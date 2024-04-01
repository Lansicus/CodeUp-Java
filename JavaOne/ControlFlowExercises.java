package JavaOne;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /*While

        Create an integer variable i with a value of 5.
        Create a while loop that runs so long as i is less than or equal to 15
        Each loop iteration, output the current value of i, then increment i by one.
        Your output should look like this:

        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15*/
//  int a = 5;
//         while (a <= 15) {
//             System.out.println(a);
//             a++;
//         }
////-------------------------------------------
        /*Do While
        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        Alter your loop to count backwards by 5's from 100 to -10.
         */
    int b = 100;
// do {
//     System.out.println(b);
//     b -= 5;
// } while (b >= -10);
    // for(; b >= -10; b -= 5) {
    //     System.out.println(b);
    // }
////-------------------------------------------
/*Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. 
Output should equal:
2
4
16
256
*/
int c = 2;
        // do {
        //     System.out.println(c); // Print the current value of c
        //     c *= c; // Multiply c by itself
        // } while (c <= 10000);
            // for(;c < 10000; c *= c) {
            //     System.out.println(c);
            // }
        /* Refactor the previous two exercises to use a for loop instead.*/
////-------------------------------------------
        /*Fizzbuzz */
//     for(int d = 1; d < 100; d++) {
//         if (d % 3 == 0 && d % 5 == 0)
//             System.out.println("FizzBuzz");
//         else if (d % 5 == 0)
//             System.out.println("Buzz");
//         else if (
//             d % 3 == 0
//         ) System.out.println("Fizz");
//         else System.out.println(d);
// }
////--------------------------------------------
        /*Display a table of powers.
        Prompt the user to enter an integer.
        Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to.
        Example Output

        What number would you like to go up to? 5

        Here is your table!

        number | squared | cubed
        ------ | ------- | -----
        1      | 1       | 1
        2      | 4       | 8
        3      | 9       | 27
        4      | 16      | 64
        5      | 25      | 125*/
Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number from 1 - 6: ");
// int numbInput = scanner.nextInt();
// if (numbInput < 1 || numbInput > 6) {
//     System.out.println("You did not enter a number from 1 - 6.");
// }
// else {
// System.out.println("Here is your table \n\n");
// System.out.println("number | squared | cubed");
// System.out.println("------ | ------- | -----");

// for (int i = 1; i <= numbInput; i++) {
//     int squared = i * i;
//     int cubed = i * i * i;
//     System.out.printf("%-6d | %-7d | %-5d\n", i, squared, cubed);
// }
// }
/*Convert given number grades into letter grades.
Prompt the user for a numerical grade from 0 to 100.
Display the corresponding letter grade.
Prompt the user to continue.
Assume that the user will enter valid integers for the grades.
The application should only continue if the user agrees to.
Grade Ranges:
A : 100 - 88
B : 87 - 80
C : 79 - 67
D : 66 - 60
F : 59 - 0*/
boolean continuePrompt = true;

while (continuePrompt) {
System.out.print("Enter a numerical grade value from 0 - 100: ");
int grade = scanner.nextInt();
if (grade < 0 || grade > 100) {
    System.out.println("You have not entered a numerical value from 0 - 100");
} else if (grade > 87) {
System.out.println("A");
} else if (grade > 79) {
    System.out.println("B");
} else if (grade > 66) {
    System.out.println("C");
} else if (grade > 59) {
    System.out.println("D");
} else {
    System.out.println("F");
}
System.out.println("Do you wish to continue? [y/n] ");
String choice = scanner.next();
continuePrompt = choice.equalsIgnoreCase("yes");
}
scanner.close();
    }
}