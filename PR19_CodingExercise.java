/*Write a Java program using packages to generate a mark sheet for students. Create a package
student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the mark
sheet.*/
    package exam;

import student.Student;
import java.util.Scanner;

public class Result extends Student {

    int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {

        displayStudent();

        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        Result r = new Result(rollNo, name, m1, m2, m3);

        System.out.println("\n--- MARK SHEET ---");
        r.displayResult();
    }
}
