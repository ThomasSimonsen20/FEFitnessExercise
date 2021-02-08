package demo;

public class Administration extends Employee{

    int vacation;

    public Administration(String name, String cpr) {
        super(name, cpr);
        this.salary = 33000;
        this.vacation = 5;
        this.hours = 37;
    }

    public int getVacation() {
        return vacation;
    }


    @Override
    public String toString() {
        return "" + name +
                "     " + cpr +
                "     " + hours +
                "           " + salary +
                "      " + vacation;
    }
}
