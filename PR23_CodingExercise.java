/* Aim:
   Write a Java program that creates two threads.
   First thread prints numbers from 1 to 10 at the interval of 1 second.
   Second thread prints numbers from 11 to 20 at the interval of 500 ms.
   Run both threads and display the output.
*/

class FirstThread extends Thread
{
    
    public void run()
    {
        try
        {
           
            for(int i=1; i<=10; i++)
            {
                System.out.println("First Thread : " + i);

             
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class SecondThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i=11; i<=20; i++)
            {
                System.out.println("Second Thread : " + i);

                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class PR23_CodingExercise {
    public static void main(String args[])
    {
        
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

      
        t1.start();
        t2.start();
    }
}

/* Output:

First Thread : 1
Second Thread : 11
Second Thread : 12
First Thread : 2
Second Thread : 13
Second Thread : 14
First Thread : 3
Second Thread : 15
Second Thread : 16
First Thread : 4
Second Thread : 17
Second Thread : 18
First Thread : 5
Second Thread : 19
Second Thread : 20
First Thread : 6
First Thread : 7
First Thread : 8
First Thread : 9
First Thread : 10

*/