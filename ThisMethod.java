class ThisMethod
  {
    void display() //method1
    {
      this.display1(); //calling the method2
      // we can call the method2 without create this keyword eg: display1()
      System.out.println("Jagadeesh");
    }
    void display1() //method2
    {
      System.out.println("Santosh");
    }
    void display2() //method3
    {
      System.out.println("Sandy");
    }
    public static void main(String args[])
    {
      ThisMethod obj = new ThisMethod();
      obj.display(); //calling the method1 function
      obj.display2(); //calling the method3 function
    }
  }