// Write a JAVA program to check whether a number is Prime number or not.

import java.util.Scanner;
class PrimeNumber
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int a = 1;
      int count = 0;
      while(a<=num)
        {
          if(num%a==0)
          {
            count++;
          }
          a++;
        }
      if(count==2)
      {
        System.out.println("It is a prime number");
      }
      else
      {
        System.out.println("It is not a prime number");
      }
    }
  }