// Write a JAVA program to calculate product of digits of a number.

import java.util.Scanner;
class ProductofDigit
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int rem = 0;
      int pro = 1;
      while(num!=0)
        {
          rem = num%10;
          pro = pro * rem;
          num = num/10;
        }
      System.out.println("The product of digits of a number is: "+pro);
    }
  }