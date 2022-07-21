import java.util.Scanner;
class EvenOddArrays
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int n = sc.nextInt();
      System.out.println("Enter the elements: ");
      int a[] = new int[n];
      int i;
      for( i=0; i<n; i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("New array with even numbers separation:");
      int b[] = new int[a.length];
      for( i=0; i<a.length; i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
      System.out.println("New array with odd numbers separation:");
      int c[] = new int[a.length];
      for( i=0; i<a.length; i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }