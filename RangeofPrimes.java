// Write a JAVA program to print all Prime numbers between 1 to n. 

import java.util.Scanner;
class RangeofPrimes
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value");
      int n = sc.nextInt();
      int count;
      for(int i=1; i<=n; i++)
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
            System.out.println(i);
          }
        }
    }
  }