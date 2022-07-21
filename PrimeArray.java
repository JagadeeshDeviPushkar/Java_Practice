import java.util.Scanner;
class PrimeArray
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size");
      int n= sc.nextInt();
      int a[] = new int[n];
      System.out.println("Enter the elements");
      for(int i=0; i<n; i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0; i<=n; i++)
        {
          int count =0;
          for(int j=1; j<=a[i]; j++)
            {
              if(a[i]%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println("Prime numbers are "+a[i]);
          }
        }
    }
  }