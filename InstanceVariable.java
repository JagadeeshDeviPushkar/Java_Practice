//Instance variable
class InstanceVariable
  {
    //Instance variable
    String name = "Jagadeesh";
    int age = 24;
    // method creation
    void age()
    {
      System.out.println("Age: "+age); //simple method
    }
    public static void main(String args[])
    {
      InstanceVariable obj = new InstanceVariable();
      System.out.println("Name: "+obj.name); //static method uses object.
      obj.age(); //calling the method
    }
  }