/*  Write a JAVA program to find sum of all even numbers between 1 to n. */

import java.util.Scanner;
class SumofEven
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int a = 1;
      int sum = 0;
      while(a<=n)
        {
          if(a%2==0)
          {
            sum += a;
          }
          a++;
        }
      System.out.println("Sum of even numbers from 1 to "+n+" is: "+sum);
    }
  }