class Animal
  {
    void printA()
    {
      System.out.println("Animal is running");
    }
  }
class Dog extends Animal
  {
    void printB()
    {
      System.out.println("Dog is running");
    }
  }
class SingleInheritance
  {
    public static void main(String args[])
    {
      Dog d = new Dog();
      d.printB();
      d.printA();
    }
  }