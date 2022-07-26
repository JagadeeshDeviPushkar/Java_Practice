class ThisConstructor
  {
    ThisConstructor() //Constructor1
    {
      System.out.println("Jagadeesh");
    }
    ThisConstructor(String name) //Constructor2
    {
      this(); //calling the constructor1
      System.out.println(name);
    }
    public static void main(String args[])
    {
      ThisConstructor obj = new ThisConstructor("Santosh"); //calling the constructor2
    }
  }