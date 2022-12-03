package day36_Inheritance.EmployeeTask;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }
  public void   testing(){
      System.out.println(name+" is testing");
  }
   public void creatingTicket(){
       System.out.println(name+" is creatingTicket");
   }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
