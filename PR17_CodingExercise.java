/*
Aim:
Write the Java code for an interface named Exam which declares a single abstract method boolean
isPassed(int mark). This method should take an integer mark as an argument. Write the Java code
for another interface named Classify which declares a single abstract method String
getDivision(double average). This method should take a double average as an argument. Create a
class named Result that implements both the Exam and Classify interfaces. Provide concrete
implementations for isPassed() and getDivision() methods. In your main method, create an
instance of Result, accept marks of three subjects, calculate average, and demonstrate the use of
both interface methods.
*/

import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else if (average >= 35)
            return "Pass Class";
        else
            return "Fail";
    }
}

public class PR17_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        double average = (m1 + m2 + m3) / 3.0;

        System.out.println("Subject 1 Passed: " + r.isPassed(m1));
        System.out.println("Subject 2 Passed: " + r.isPassed(m2));
        System.out.println("Subject 3 Passed: " + r.isPassed(m3));

        System.out.println("Average = " + average);
        System.out.println("Division = " + r.getDivision(average));
    }
}

/*
Output:
Enter marks of Subject 1: 70
Enter marks of Subject 2: 65
Enter marks of Subject 3: 75
Subject 1 Passed: true
Subject 2 Passed: true
Subject 3 Passed: true
Average = 70.0
Division = First Division
*/