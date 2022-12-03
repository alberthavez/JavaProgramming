package day36_Inheritance.EmployeeTask;

public class Teacher extends Employee{
    public Teacher(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }
  public void   teaching(){
      System.out.println(name+" is teaching");
  }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
