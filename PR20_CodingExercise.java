/*
Aim:
Take the value of numerator and denominator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time errors.
*/

public class PR20_CodingExercise {

    public static void main(String[] args) {

        try {
        
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator");
            }

            
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

          
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

