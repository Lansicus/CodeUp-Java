package JavaOne;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // double pi = 3.14159;
        // System.out.format("The value of pi is approximately %.2f%n", pi);

        // // Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        // System.out.print("Enter a number: ");
        // int numbInput = scanner.nextInt();
        // System.out.println("You entered \"" + numbInput + "\"");

        // // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // // Then, display them back in the console, each on a newline.
        // System.out.print("You'll now enter 3 words: ");
        // String word1 = scanner.next();
        // String word2 = scanner.next();
        // String word3 = scanner.next();
        // System.out.println("You have entered:\n\"" + word1 + "\"\n\"" + word2 + "\"\n\"" + word3 + "\"");

        // // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // // Then, display that sentence back to the user.
        // System.out.print("Enter a sentence: ");
        // scanner.nextLine();
        // String sentence1 = scanner.nextLine();
        // System.out.println("Your sentence is: " + sentence1);

        /*Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        Use the nextLine method each time you need to get user input. In this case, we need it twice, 
        once to get the user input for the length and again to get the user input for the width. 
        Parse the resulting strings to a numeric type.
        Assume that the rooms are perfect rectangles.
        Assume that the user will enter valid numeric data for length and width.*/ 
        System.out.print("What is the width of the class room? " );
        int width = scanner.nextInt();
        System.out.print("What is it's length? ");
        int length = scanner.nextInt();

        int area = width * length;
        int perimeter = 2 * (width + length);
        // Display the area and perimeter of that classroom.
        System.out.println("The area of the classroom is: " + (width * length));
        System.out.println("The perimeter of the classroom is: " + (width * 2 + length * 2));
        scanner.close();
    }
}