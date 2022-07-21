import java.util.Scanner;
class Minimum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size");
      int n = sc.nextInt();
      System.out.println("Enter the array elements");
      int a[] = new int[n];
      for(int i=0; i<n; i++)
        {
          a[i]=sc.nextInt();
        }
      int min = a[0];
      for(int i=0; i<n; i++)
        {
          if(a[i]<min)
          {
            min = a[i];
          }
        }
      System.out.println("Minimum element is: "+min);
    }
  }