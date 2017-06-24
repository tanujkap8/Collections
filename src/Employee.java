/**
 * Created by tanuj on 6/22/17.
 */
public class Employee{

    String name;
    double salary,age;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    Employee(String name, double age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return name+" "+age+" "+salary;
    }
}
