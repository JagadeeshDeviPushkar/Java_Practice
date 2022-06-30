/* Write a JAVA program to find first and last digit of a number. */

import java.util.Scanner;
class FirstLastDigit
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int last_digit = 0;
      int first_digit = 0;
      last_digit = num%10;
      while(num!=0)
        {
          first_digit = num%10;
          num = num/10;
        }
      System.out.println("The first digit is "+first_digit);
      System.out.println("The last digit is "+last_digit);
    }
  }