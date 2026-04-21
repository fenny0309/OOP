/*
AIM:
Design a base class Shape with two double data members d1 and d2 to store dimensions.
Include a method getData(double d1, double d2) to initialize these dimensions.
Create two derived classes, Triangle and Rectangle, which inherit from Shape.
Each derived class should have its own method to calculate its specific area.
*/

import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

public class PR13_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height of Triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(b, h);

        System.out.print("Enter length and width of Rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.getData(l, w);

        System.out.println("\nArea of Triangle: " + t.area());
        System.out.println("Area of Rectangle: " + r.area());

        sc.close();
    }
}

/*
OUTPUT:

Enter base and height of Triangle: 12 8
Enter length and width of Rectangle: 7 6

Area of Triangle: 48.0
Area of Rectangle: 42.0
*/