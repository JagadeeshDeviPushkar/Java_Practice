import java.util.Scanner;
class New
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements size");
      int n = sc.nextInt();
      System.out.println("Enter the elements value");
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter the element value to delete");
      int a = sc.nextInt();
      int i;
      for( i=0; i<arr.length; i++)
        {
          if(arr[i]==a)
          {
            for(int j=i; j<arr.length-1; j++)
              {
                arr[j]= arr[j+1];
              }
            System.out.println("After deletion");
            System.out.println(arr[i]);
          }
          else
          {
            System.out.println(arr[i]);
          }
        }
        
        }
    }