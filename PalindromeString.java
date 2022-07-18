// Write a JAVA program to check whether a string is palindrome or not. 

import java.util.Scanner;
class PalindromeString
  {
    public static void main(String args[])
    {
      String rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      for(int i=str.length()-1; i>=0; i--)
        {
          rev = rev + str.charAt(i);
        }
      if(str.toLowerCase().equals(rev.toLowerCase()))
      {
        System.out.println(str+" is a Palindrome");
      }
      else
      {
        System.out.println(str+" is not a Palindrome");
      }
    }
  }