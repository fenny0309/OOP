/* Aim:
   Write a Java program that will count the number of characters,
   words, and lines in a file. Words are separated by whitespace
   characters. The file name should be passed as a command-line argument.
*/

import java.io.*;

public class PR26_CodingExercose
{
    public static void main(String args[]) throws Exception
    {
        if(args.length==0)
        {
            System.out.println("Please pass file name as command-line argument");
            return;
        }

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int charCount = 0, wordCount = 0, lineCount = 0;

        while((line = br.readLine()) != null)
        {
            lineCount++;

            charCount = charCount + line.length();

            String words[] = line.trim().split("\\s+");

            if(line.trim().length() > 0)
            {
                wordCount = wordCount + words.length;
            }
        }

        br.close();

        System.out.println("Number of Characters = " + charCount);
        System.out.println("Number of Words = " + wordCount);
        System.out.println("Number of Lines = " + lineCount);
    }
}

/* Output:

C:\Users\Mahadev>javac PR26_CodingExercose.java

C:\Users\Mahadev>java PR26_CodingExercose test.txt

Number of Characters = 45
Number of Words = 9
Number of Lines = 3

*/