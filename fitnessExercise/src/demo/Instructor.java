package demo;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getSalary() {
        return hours * 199;
    }

    @Override
    public String toString() {
        return "" + name +
                "    " + cpr +
                "     " + hours +
                "           " + getSalary();
    }
}
