// Write a JAVA program to search all occurrences of a character in given string.

import java.util.Scanner;
class AllOccurence
  {
    public static void main(String args[])
    {
      int i=0;
      int count=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string");
      String str = sc.nextLine();
      System.out.println("Enter a character: ");
      char ch = sc.next().charAt(0);
      for(i=0; i<str.length(); i++)
        {
          if(str.charAt(i)==ch)
          {
            count++;
          }
        }
      System.out.println("Total no of occurence: "+ch+ " is "+count);
    }
  }