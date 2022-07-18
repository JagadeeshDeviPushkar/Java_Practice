import java.util.Scanner;
public class PrimeAscii
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size");
      int n = sc.nextInt();
      System.out.println("characters");  
      char arr[] = new char[n];
      for(int i=0; i<n; i++)
        {
          arr[i] = sc.next().charAt(0);
        }
      for(int i=0; i<n; i++)
        {
          System.out.println((int)arr[i]);
          
          int temp = (int)arr[i];
          int count = 0;
          for(int j=i; j<temp; j++)
            {
              if(temp%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println(arr[i]);
          }

        }
    }
  }