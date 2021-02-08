package demo;

public class Employee extends Person{

    int hours;
    protected int salary;

    public Employee(String name, String cpr) {
        super(name, cpr);
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
