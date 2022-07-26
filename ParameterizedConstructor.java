class ParameterizedConstructor
  {
    String name;
    int age;
    ParameterizedConstructor(String n, int a)
    {
      name = n;
      age = a;
    }
    public static void main(String args[])
    {
      ParameterizedConstructor obj = new ParameterizedConstructor("Jagadeesh", 24);
      ParameterizedConstructor obj1 = new ParameterizedConstructor("Santosh", 12);
      System.out.println("Name: "+obj.name+" Age: "+obj.age);
      System.out.println("Name: "+obj1.name+" Age: "+obj1.age);
    }
  }