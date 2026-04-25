/* Aim:
   Write a Java program where Thread T1 prints 1 to 100,
   Thread T2 prints 101 to 200 and Thread T3 prints 201 to 300.
   Start all three threads and ensure numbers are printed sequentially.
*/

class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread T1 : " + i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println("Thread T2 : " + i);
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println("Thread T3 : " + i);
        }
    }
}

public class PR24_CodingExercise {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();

        try {
            t1.join();   
        } catch (Exception e) {
        }

        t2.start();

        try {
            t2.join();   
        } catch (Exception e) {
        }

        t3.start();

        try {
            t3.join();   
        } catch (Exception e) {
        }
    }
}