class MathTecaher
  {
    void teach()
    {
      System.out.println("Mathematics teacher");
    }
  }
class TeluguTeacher
  {
    void teach()
    {
      System.out.println("Telugu teacher");
    }
  }
class Teacher
  {
    public static void main(String args[])
    {
      TeluguTeacher subj = new TeluguTeacher();
      subj.teach();
    }
  }