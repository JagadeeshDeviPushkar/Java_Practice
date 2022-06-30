// Write a JAVA program to find all factors of a number.

import java.util.Scanner;
class Factors
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      int a = 1;
      while(a<=num)
      {
        if(num%a==0)
        {
          System.out.println(a);
        }
        a++;
      }
    }
  }