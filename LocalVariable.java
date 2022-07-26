//Local Variable declaration
class LocalVariable
  {
    void printName()
    {
      String name = "Jagadeesh";
      System.out.println("My name is "+name);
    }
    public static void main(String args[])
    {
      LocalVariable obj = new LocalVariable();
      obj.printName();
    }
  }