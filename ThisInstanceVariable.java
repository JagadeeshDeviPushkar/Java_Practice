class ThisInstanceVariable
  {
    String n;
    ThisInstanceVariable(String n) //constructor
    {
      this.n = n; //calling the instance variable
    }
    void display()  //method
    {
      System.out.println("Jagadeesh "+n);
    }
    public static void main(String args[])
    {
      ThisInstanceVariable obj = new ThisInstanceVariable("Santosh");
      obj.display();
    }
  }