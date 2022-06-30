// // Write a JAVA program to print all Prime numbers between first interval to last interval.

import java.util.Scanner;
class PrimeRange
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the starting number");
      int a = sc.nextInt();
      System.out.println("Enter the second number");
      int b = sc.nextInt();
      int count;
      for(int i=a; i<=b; i++)
        {
          count = 0;
          for(int j=1; j<=i; j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.print(i+" ");
          }
        }
    }
  }