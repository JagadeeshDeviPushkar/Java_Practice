/* Write a JAVA program to print multiplication table of any number. */

import java.util.Scanner;
class Multiplication
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a number");
      int a = sc.nextInt();
      int n = 1;
      while(n<=10)
        {
          System.out.println(a+" * "+n+" = "+(a*n));
          n++;
        }
    }
  }