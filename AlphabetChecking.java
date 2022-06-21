// 6.Write a JAVA program to check whether a character is alphabet or not.

import java.util.Scanner;
class AlphabetChecking
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Alphabet");
      char alpha = sc.next().charAt(0);
      if((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z'))
      {
        System.out.println(alpha+" is a alphabet");
      }
      else
      {
        System.out.println("Invalid Character");
      }
    }
  }