// Write a JAVA program to find sum of first and last digit of a number. 

import java.util.Scanner;
class SumFirstLastDigit
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int first = 0;
      int last = 0;
      int sum = 0;
      last = num%10;
      while(num!=0)
        {
          first = num%10; 
          num = num/10;
        }
      sum = first + last;
      System.out.println("Sum of first and last digit is: "+sum);  
    }
  }
