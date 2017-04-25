/**
 * Created by jared on 4/12/17.
 * New project created to conform with file name requirements
 */
public class StrattonJared1 {
    // class constants, one per part, all of these are scalable
    public static final int FIBONACCI = 20; // part 1, Fibonacci, quantity of desired results
    public static final int RIGHTLINES = 9; // part 2, quantity of lines desired
    public static final int STICKMEN = 12;   // part 3, number of 'steps' or 'stick men' desired

    // main call, the big show
    public static void main(String[] args)  {

        // Program 1 Part 1
        System.out.println("Chapter 2: Exercise 3; print the first 20 Fibonacci numbers.");
        int FibA = 1;   // a number in the Fibonacci sequence, just prior to the value of FibB
        int FibB = 1;   // a number in the Fibonacci sequence, just after the value of FibA
        int sum;    // internal variable representing the sum of FibA and FibB

        System.out.print(FibA);       // print that first given number
        System.out.print(" ");
        System.out.print(FibB);      // print that second given number

        for (int i = 0; i < (FIBONACCI - 2); i++)  {   // -2 because first 2 numbers printed
            sum = FibA + FibB;
            System.out.print(" " + sum);
            FibA = FibB;
            FibB = sum;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Program 1 Part 2
        System.out.println("Chapter 2: Exercise 8; extend the figure to nine lines.");

        // gave each little for loop it's own letter-variable, no point in risking a mixup
        for (int i = 1; i <= RIGHTLINES; i++)  {            // for-loop containing two for-loops
            for (int y = 0; y < (RIGHTLINES - i); y++)    { // controls number of spaces printed
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++) {                   // controls number of integers printed
                System.out.print(i);
            }
            System.out.println();                           // "carriage return"
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Program 1 Part 3
        System.out.println("Chapter 2: Programming Project 5 ...");

        // "margin" is an integer, "indent" is a string of blank spaces
        int leftMargin = -5 + (5 * STICKMEN);   // between left edge and stickmen
        int rightMargin = 0;                    // between step-face and asterisk "wall" on the right
        int floorWidth = 7 + (5 * STICKMEN);    // overall width of the floor

        // calls the method to print the stickmen, adjusts and passes in margins
        for (int j = 0; j < STICKMEN; j++) {
            printStep(leftMargin, rightMargin);
            leftMargin = leftMargin - 5;
            rightMargin = rightMargin + 5;
        }
        // calls the method to print the floor at the bottom
        printFloor(floorWidth);
    }   // end of main

    // this method for indents and draws everything above the floor
    public static void printStep(int leftMargin,int rightMargin)   {
        String leftIndent = indentBuilder(leftMargin);
        String rightIndent = indentBuilder(rightMargin);
        System.out.println(leftIndent + "  O  ******" + rightIndent + "*");
        System.out.println(leftIndent + " /|\\ *     " + rightIndent + "*");
        System.out.println(leftIndent + " / \\ *     " + rightIndent + "*");
    }

    // converts integer value into string of blank spaces
    public static String indentBuilder(int input)  {
        String indent = "";
        for (int i=0; i<input; i++)  {
            indent = indent + " ";
        }
        return indent;
    }

    // converts integer value into string of asterisks
    public static void printFloor(int input)  {
        String floor = "";
        for (int i=0; i<(input); i++)  {
            floor = floor + "*";
        }
        System.out.println(floor);
    }

}   // end of class
