/*  Write a JAVA program to count number of digits in a number.  */

import java.util.Scanner;
class DigitCount
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int count = 0;
      while(num!=0)
        {
          num /= 10;
          count++;
        }
      System.out.println("Number of digits in a number is: "+count);
    }
  }