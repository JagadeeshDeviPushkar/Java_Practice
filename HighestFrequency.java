// Write a JAVA program to find highest frequency character in a string. 

import java.util.Scanner;
class HighestFrequency
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String str = sc.nextLine();
      int[] freq = new int[str.length()]; 
      char maxChar = str.charAt(0);  
      int i, j, max; 
      char[] string = str.toCharArray();
      for(i=0; i<str.length(); i++)
        {
          freq[i]=1;
          for(j=i+1; j<str.length(); j++)
            {
              if(string[i]==string[j] && string[i] != ' ')
              {
                freq[i]++;
                string[j]=' ';
              }
            }
        }
      max = freq[0];
      for(i=0; i<freq.length; i++)
        {
          if(max < freq[i])
          {
            max =freq[i];
            maxChar = string[i];
          }
        }
      System.out.println("Maximum occurring character: " + maxChar);
    }
  }