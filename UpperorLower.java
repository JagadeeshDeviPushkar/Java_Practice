// 9.Write a JAVA program to check whether a character is uppercase or lowercase  alphabet.

import java.util.Scanner;
public class UpperorLower
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the character: ");
    char ch=scan.next().charAt(0);
    if(ch>='A' && ch<='Z')
    {
      System.out.println(ch+" is an upper case letter");
    }
    else if(ch>='a' && ch<='z')
    {
    System.out.println(ch+" is a lower case letter");
    }
    else
    {
    System.out.println(ch+" is not a Alphabet");
    }
  }
}