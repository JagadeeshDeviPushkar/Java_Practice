// 4.Write a JAVA program to check whether a number is even or odd. 

import java.util.Scanner;
class EvenorOdd
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      if(num%2==0)
      {
        System.out.println(num+" is a even number");
      }
      else
      {
        System.out.println(num+" is an odd number");
      }
    }
  }