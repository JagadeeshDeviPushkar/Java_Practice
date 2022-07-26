class Vehicle
  {
    void vehicle()
    {
      System.out.println("Vehicle is moving");
    }
  }
class Bike extends Vehicle
  {
    void bike()
    {
      System.out.println("Bike speed is 100kmph");
    }
  }
class Car extends Vehicle
  {
    void car()
    {
      System.out.println("Car speed is 140kmph");
    }
  }
class HierarchicalInheritance
  {
    public static void main(String args[])
    {
      Bike b = new Bike();
      Car c = new Car();

      b.vehicle(); //calling the vehicle class method
      b.bike(); //calling the bike class method

      c.vehicle(); //calling the vehicle method
      c.car(); //calling the car class method
    }
  }