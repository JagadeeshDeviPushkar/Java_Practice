/*  Write a JAVA program to print all natural numbers in reverse (from max to min ). - using while loop 
*/

import java.util.Scanner;
class RevRangeNatural
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the maximum number: ");
      int max = sc.nextInt();
      System.out.println("Enter the minimum number: ");
      int min = sc.nextInt();
      while(max>=min)
        {
          System.out.println(max);
          max--;
        }
    }
  }