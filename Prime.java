import java.util.Scanner;
class Prime
  {
    public static void prime(int n)
    {
      int a = 1;
      int count = 0;
      while(a<=n)
        {
          if(n%a==0)
          {
            count++;
          }
          a++;
        }
      if(count==2)
      {
        System.out.println("It is a prime number");
      }
      else
      {
        System.out.println("It is not a prime number");
      }
    }
    public static void main(String args[])
    {
      Prime.prime(1);
    }
  }