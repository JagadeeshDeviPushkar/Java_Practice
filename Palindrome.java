// Write a JAVA program to check whether a number is palindrome or not.

import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      int temp;
      int rev = 0;
      int rem = 0;
      temp = num;
      while(num!=0)
        {
          rem = num%10;
          rev = rev*10+rem;
          num = num/10;
        }
      if(temp==rev)
          {
            System.out.println("It is a palindrome number");
          }
          else
          {
            System.out.println("It is not a palindrome number");
          }
    }
  }