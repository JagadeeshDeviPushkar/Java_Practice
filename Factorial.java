// Write a JAVA program to calculate factorial of a number.

import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int a = 1;
      int fact = 1;
      while(a<=num)
        {
          fact = fact*a;
          a++;
        }
      System.out.println("The factorial of a number is: "+fact);
    }
  }