/*
AIM:
Write a Java program using packages to generate a mark sheet for students. Create a package
student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the mark sheet.

NOTE:
This program demonstrates the use of packages and inheritance in Java.
It is written in a combined format for GitHub/lab record submission.
In actual Java implementation, each package should be placed in separate files.
*/

/* -------------------- PACKAGE student -------------------- */
package student;

public class Student {
    public int rollNo;
    public String name;

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

/* -------------------- PACKAGE exam -------------------- */
package exam;

import student.Student;
import java.util.Scanner;

public class PR20_CodingExercise extends Student {

    int marks1, marks2, marks3;

    public PR19_CodingExercise(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {

        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        displayStudent();

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        PR19_CodingExercise obj = new PR19_CodingExercise(r, n, m1, m2, m3);

        System.out.println("\n----MARK SHEET----");
        obj.displayResult();

        sc.close();
    }
}

/*
OUTPUT:

Enter Roll No: 101
Enter Name: Rahul
Enter Marks 1: 85
Enter Marks 2: 90
Enter Marks 3: 88

----MARK SHEET----
Roll No: 101
Name: Rahul
Marks 1: 85
Marks 2: 90
Marks 3: 88
Total   : 263
Average : 87.66666666666667
*/