// Write a program to find a number is Armstrong number or not.

import java.util.Scanner;
import java.lang.Math;
class Armstrong
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int temp;
      int count = 0;
      int rem = 0;
      int sum = 0;
      temp = num;
      while(num!=0)
        {
          num = num/10;
          count++;
        }
      num = temp;
      while(num!=0)
        {
          rem = num%10;
          sum += (Math.pow(rem,count));
          num = num/10;
        }
      if(temp==sum)
      {
        System.out.println("It is armstrong number");
      }
      else
      {
        System.out.println("It is not a armstrong number");
      }
    }
  }