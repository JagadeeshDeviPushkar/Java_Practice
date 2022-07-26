/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/


import java.util.Scanner;

public class TwoDimentionalArray {
  public static void main(String args[])  
    {
      //Declare the variables
      int i, j;
      System.out.println("Enter number of rows and columns: ");
      Scanner s = new Scanner(System.in);
      //Take input from user to enter rows and column values
      int row = s.nextInt();
      int column = s.nextInt();
      int array[][] = new int[row][column];
      int tempi = 0,tempj = 0;
      int max = array[0][0];
      for(i = 0; i < row; i++)
      {
        for(j = 0; j < column; j++) 
        {
          System.out.print("Enter arr ["+i+"]["+j+"]");
          array[i][j] = s.nextInt();
        	System.out.println();
            
        }
  	  }                                   
      for(i = 0; i < array.length; i++)
    	{
      	    for(j = 0; j < array[i].length; j++){    

              if(array[i][j]>max){    
                max = array[i][j];
                tempi=i;
                tempj=j;
              }
            }
      }
      System.out.println("Largest element in array is "+max+" its index position is arr ["+tempi+"] ["+tempj+"]");
      }
}
