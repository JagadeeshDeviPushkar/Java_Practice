class MethodOverloading
  {
    static int add(int a, int b)
    {
      return a+b;
    }
    static int add(int a, int b, int c)
    {
      return a+b+c;
    }
    static double add(double a, double b, int c)
    {
      return a+b+c;
    }
    public static void main(String args[])
    {
      MethodOverloading obj = new MethodOverloading();
      int x = 20;
      int y = 30;
      int z = 40;
      double e = 15.5;
      double f = 16.4;
      System.out.println(obj.add(x, y, z));
      System.out.println(obj.add(x, y));
      System.out.println(obj.add(e, f, y));
    }
  }