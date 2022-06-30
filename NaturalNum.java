/* 
Write a JAVA program to print all natural numbers from 1 to n. - using while loop 
*/

import java.util.Scanner;
class NaturalNum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter upto a number: ");
      int num = sc.nextInt();
      int i = 1;
      while(i<=num)
        {
          System.out.println(i);
          i++;
        }
    }
  }