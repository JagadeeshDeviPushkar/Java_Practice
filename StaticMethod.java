// Minimum number comparison
import java.util.Scanner;
class StaticMethod
  {
    int i;
    int j;
    static void min(int a, int b)
    {
      if(a<b)
        System.out.println(a+" is min");
      else
        System.out.println(b+" is min");
    }
    public static void main(String args[])
    {
      InstanceMethod obj = new InstanceMethod();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers");
      int c = sc.nextInt();
      int d = sc.nextInt();
      min(c,d);
    }
  }