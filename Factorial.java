import java.util.*;
class Factorial
  {
    public static void fact(int n)
    {
      int fact=1;
      if(n==0)
      {
        fact=0; 
        System.out.println(fact);
      }
      else if(n==1)
      {
        fact=1;
        System.out.println(fact);
      }
      else
      {
        for(int i=1;i<=n;i++)
          {
            fact=fact*i;

          }
        System.out.println(fact);
      }
    }

      public static void main(String args[])
        {
        Factorial.fact(5);
        }

  }