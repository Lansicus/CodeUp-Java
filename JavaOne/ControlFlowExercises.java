package JavaOne;

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
        
        /*Fizzbuzz */
int d = 1;
    for(; d < 100; d++) {
        if (d % 3 == 0 && d % 5 == 0)
            System.out.println("FizzBuzz");
        else if (d % 5 == 0)
            System.out.println("Buzz");
        else if (
            d % 3 == 0
        ) System.out.println("Fizz");
        else System.out.println(d);
}
}
}