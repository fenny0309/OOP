/* Aim:
   Write a program that accepts a sentence from the user and counts the frequency of each word using
   a HashMap<String, Integer>. Display the results in the format:
   Input: "Java is fun and Java is powerful"
   Output:
   Java -> 2
   is -> 2
   fun -> 1
   and -> 1
   powerful -> 1
*/

import java.util.*;

public class PR30_CodingExercise {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String words[] = sentence.split("\\s+");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String w : words)
        {
            if(map.containsKey(w))
            {
                map.put(w, map.get(w) + 1);
            }
            else
            {
                map.put(w, 1);
            }
        }

        System.out.println("\nWord Frequency:");

        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

/* OUTPUT:

Enter a sentence: Java is fun and Java is powerful

Word Frequency:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1

*/