/*
AIM:
Create a base class named Employee that contains a method displayDetails() which prints general
employee details such as name and department. Now create a subclass Manager that inherits from
Employee and overrides the displayDetails() method to include additional information such as the
manager's team size or project name. In the main method, create objects of both Employee and
Manager classes and call the displayDetails() method using each object to show how Java
determines which version of the method to execute at runtime.
*/

import java.util.Scanner;

class Employee {
    String name;
    String department;

    void getData(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void getData(String name, String department, int teamSize, String projectName) {
        this.name = name;
        this.department = department;
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class PR15_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        String ename = sc.nextLine();

        System.out.print("Department: ");
        String edep = sc.nextLine();

        Employee e1 = new Employee();
        e1.getData(ename, edep);

      
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        String mname = sc.nextLine();

        System.out.print("Department: ");
        String mdep = sc.nextLine();

        System.out.print("Team Size: ");
        int team = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Project Name: ");
        String project = sc.nextLine();

        Manager m1 = new Manager();
        m1.getData(mname, mdep, team, project);

        System.out.println("\n---- Employee Details ----");
        e1.displayDetails();

        System.out.println("\n---- Manager Details ----");
        m1.displayDetails();
    }
}

/*
SAMPLE OUTPUT:

Enter Employee details:
Name: Rahul
Department: IT

Enter Manager details:
Name: Amit
Department: Software
Team Size: 10
Project Name: AI System

---- Employee Details ----
Employee Name: Rahul
Department: IT

---- Manager Details ----
Manager Name: Amit
Department: Software
Team Size: 10
Project Name: AI System
*/