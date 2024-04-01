package JavaOne;

import java.util.Scanner;

// Create a class named StringExercise with a main method.
public class StringExercise {
    public static void main(String[] args) {
        //String Basics.

// // For each of the following output examples: create a String variable that contains the desired output and print it out to the console, 
// // you can do this with only one String variable and one print statement for each output example.
// System.out.println("We don't need no education");
// // We don't need no education
// System.out.println("We don't need no thought control");
// // We don't need no thought control
// System.out.println("Check \"this\" out! \"s inside of \"s!");
// // Check "this" out! "s inside of "s!
// System.out.println("In windows, the main drive is usually C:\\");
// // In windows, the main drive is usually C:\
// System.out.println("I can do backslashes \\, double backslashes \\\\,");
// // I can do backslashes \, double backslashes \\,
// System.out.println("and the amazing triple backslash \\\\\\");
// // and the amazing triple backslash \\\!

////-------------------------------
/* Bob is a lackadaisical teenager. In conversation, his responses are very limited.
Bob answers 'I mean, I guess.' if you ask him a question. (the input ends with a question mark)
He answers 'chill papa chill!' if you yell at him. (the input ends with an exclamation mark)
He says 'silent but deadly' if you address him without actually saying anything. (empty input)
He answers 'Whatevah.' to anything else.
Write the Java code necessary so that a user of your command line application can have a conversation with Bob. */
Scanner scanner = new Scanner(System.in);
boolean continuePrompt = true;

while (continuePrompt) {
    System.out.print("say something to Bob: ");
    String bobsPrompt = scanner.nextLine();

    if (bobsPrompt.trim().isEmpty()) {
        System.out.print("Silent but deadly");
    } else {
        char lastChar = bobsPrompt.charAt(bobsPrompt.length() -1);
        if (lastChar == '!') {
            System.out.println("chill papa chill");
        } else if (lastChar == '?') {
            System.out.println("I mean, I guess");
        } else {
            System.out.println("Whatevah");
        }
    }
        System.out.println("Do you wish to continue? [y/n]");
        String choice = scanner.next();
        continuePrompt = choice.equalsIgnoreCase("y");
        scanner.nextLine();
}
scanner.close();
    }
}
