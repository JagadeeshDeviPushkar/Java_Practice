// Write a JAVA program to find first occurrence of a character in a given string.

import java.util.Scanner;
class FirstOccurence
  {
    public static void main(String args[])
    {
      int i;
      int count = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      System.out.println("Enter a character to find: ");
      char ch = sc.next().charAt(0);
      for(i=0; i<str.length(); i++)
        {
          if(str.charAt(i)==ch)
          {
            count=1;
            break;
          }
        }
      if(count==0)
      {
        System.out.println("Not found");
      }
      else
      {
        System.out.println("The first occurence of "+ch+ " is "+i);
      }
    }
  }