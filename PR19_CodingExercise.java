/*
Write a Java program using packages to generate a mark sheet for students. Create a package
student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the mark
sheet.

NOTE:
This program demonstrates the use of packages and inheritance in Java.
It is written in a combined format for GitHub/lab record submission.
In actual Java implementation, each package should be placed in separate files.
*/

/* -------------------- CLASS Student -------------------- */
class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
    }
}

/* -------------------- CLASS Result -------------------- */
class Result extends Student {

    int marks1, marks2, marks3;

    Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayResult() {

        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("\n---- MARK SHEET ----");

        displayStudent();

        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);
    }
}

/* -------------------- MAIN CLASS -------------------- */
public class PR19_CodingExercise {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

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

        Result obj = new Result(r, n, m1, m2, m3);
        obj.displayResult();

        sc.close();
    }
}

/*
-------------------- OUTPUT --------------------

Enter Roll No: 101
Enter Name: Rahul
Enter Marks 1: 85
Enter Marks 2: 90
Enter Marks 3: 88

---- MARK SHEET ----
Roll No: 101
Name   : Rahul
Marks 1 : 85
Marks 2 : 90
Marks 3 : 88
Total   : 263
Average : 87.66666666666667
*/