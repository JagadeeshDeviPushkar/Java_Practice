/* Write a JAVA program to print all natural numbers in reverse (from n to 1). - using while loop */

import java.util.Scanner;
class RevNaturalNum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the maximum number");
      int num = sc.nextInt();
      int i=1;
      while(num>=i)
        {
          System.out.println(num);
          num--;
        }
    }
  }