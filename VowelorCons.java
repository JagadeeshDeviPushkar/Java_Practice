// 7.Write a JAVA program to input any alphabet and check whether it is vowel or    consonant. 

import java.util.Scanner;
class VowelorCons
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the alphabet: ");
      char alpha = sc.next().charAt(0);
      if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u')
      {
        System.out.println(alpha+" is a vowel");
      }
      else
      {
        System.out.println(alpha+" is a constant");
      }
    }
  }