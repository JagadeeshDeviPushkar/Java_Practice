// Write a JAVA program to find lowest frequency character in a string. 

import java.util.Scanner;
class LowestFrequency
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String str = sc.nextLine();
      int[] freq = new int[str.length()]; 
      char minChar = str.charAt(0);  
      int i, j, min; 
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
      min = freq[0];
      for(i=0; i<freq.length; i++)
        {
          if(min > freq[i])
          {
            min =freq[i];
            minChar = string[i];
          }
        }
      System.out.println("Minimum occurring character: " + minChar);
    }
  }