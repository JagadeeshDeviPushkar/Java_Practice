// Write a JAVA program to print all negative elements in an array.

import java.util.Scanner;
class NegativeArray
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size");
      int n = sc.nextInt();
      System.out.println("Enter the elements");
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("***Print the elements***");
      for(int i=0; i<arr.length; i++)
        {
          System.out.println(arr[i]);
        }
      System.out.println("Negative elements are");
      for(int i=0; i<arr.length; i++)
        {
          if(arr[i]<0)
          {
            System.out.println(arr[i]);
          }
        }
    }
  }