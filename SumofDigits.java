// Write a JAVA program to calculate sum of digits of a number.

import java.util.Scanner;
class SumofDigits
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int rem = 0;
      int sum = 0;
      while(num!=0)
        {
          rem = num%10;
          sum = sum+rem;
          num = num/10;
        }
      System.out.println("Sum of the digits of a number is: "+sum);
    }
  }