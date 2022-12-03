package day36_Inheritance.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
  public void   fixingBugs(){
      System.out.println(name+" is fixingBugs");

  }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
