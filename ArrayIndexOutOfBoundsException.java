/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    String arr[] = new String[n];
    System.out.println("Enter the string names");
    for(int i=0; i<n; i++)
      {
        arr[i] = sc.nextLine();
      }
    System.out.println("output");
    for(int i=0;i<=arr.length;i++)
      //ArrayIndexOutOfBoundsException occur
      {
        System.out.println(arr[i]);
      }
    }
}

//Good Job!
