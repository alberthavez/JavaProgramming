package day36_Inheritance.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {


        Developer developer = new Developer("John", "master cruiser", 'M', 26, 26, 26000);
        Tester tester = new Tester("Jack", "qa", 'M', 27, 27, 27000);
        Teacher teacher = new Teacher("Jane", "Ev Exp", 'F', 28, 28, 28000);
        Driver driver = new Driver("Brute", "Ford Driver", 'M', 29, 29, 29000);

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(driver);
        developer.coding();
        developer.fixingBugs();
        teacher.teaching();
        tester.testing();
        driver.driving();
    }
}
