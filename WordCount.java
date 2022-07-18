// Write a JAVA program to count total number of words in a string.

import java.util.Scanner;
class WordCount
  {
    public static void main(String args[])
    {
      int count =0; 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      String words[] = str.split(" ");
      System.out.println("Total number of words: "+words.length);
      for(int i=0; i<words.length; i++)
        {
          System.out.println(words[i]);
        }
    }
  }