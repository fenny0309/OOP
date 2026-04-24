/*
Aim:
Take the value of numerator and denominator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time errors.
*/

public class PR20_CodingExercise {

    public static void main(String[] args) {

        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator");
            }

            // Convert command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            System.out.println("Numerator   = " + numerator);
            System.out.println("Denominator = " + denominator);
            System.out.println("Result      = " + result);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("Error: Some unexpected error occurred");
        }
    }
}

/*
Output:

Case 1:
java CommandLineDivision 10 2
Numerator   = 10
Denominator = 2
Result      = 5

Case 2:
java CommandLineDivision 10
Error: Please provide numerator and denominator

Case 3:
java CommandLineDivision 10 0
Error: Cannot divide by zero

Case 4:
java CommandLineDivision 10 abc
Error: Invalid number format
*/