import java.util.*;
class Employee
  {
    int eid;
    String ename;
    String dept;
    Employee()
    {
      eid = 1234;
      ename = "Jagadeesh";
      dept = "Developer";
    }
    Employee(int i, String n, String d)
    {
      eid = i;
      ename = n;
      dept =d;
    }
    public String toString()
    {
      return "EmpID: "+eid+" EmpName: "+ename+" EmpDept: "+dept;
    }
  }

class EnployeeMain
  {
    public static void main(String args[])
    {
      Employee e1 = new Employee();
      int eid = sc.nextInt();
      String ename = sc.next();
      String dept = sc.next();
      Employee e2 = new Employee(i, n, d);
      System.out.println(e1);
      System.out.println(e2);
      
    }
  }