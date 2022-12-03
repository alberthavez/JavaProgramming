package day36_Inheritance.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }
  public void   driving(){
      System.out.println(name+" is driving");
  }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
