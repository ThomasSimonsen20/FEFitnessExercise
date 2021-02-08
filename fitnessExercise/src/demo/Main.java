package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> employees = new ArrayList<>();
        ArrayList<Person> members = new ArrayList<>();

        Person employee1 = new Administration("Tove", "011080-1014");
        employees.add(employee1);
        Person employee2 = new Instructor("Claus", "221175-1011", 50);
        employees.add(employee2);
        Person employee3 = new Administration("Anna", "011080-1013");
        employees.add(employee3);
        Person employee4 = new Instructor("Helle", "221175-1012", 40);
        employees.add(employee4);

        Person member1 = new Member("Morten", "130195-1303", true);
        members.add(member1);
        Person member2 = new Member("Martin", "221175-1011", false);
        members.add(member2);
        Person member3 = new Member("Martina", "050970-1409", true);
        members.add(member3);
        Person member4 = new Member("Marcel", "221175-1011", false);
        members.add(member4);


        System.out.println("FITNESS EMPLOYEES");
        System.out.println("Name     CPR             Hours        Salary     Vacation");
        System.out.println("**********************************************************");
        for (int i = 0; i < employees.size() ; i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\n\nFITNESS Members");
        System.out.println("Name       CPR             Member Type   Fee");
        System.out.println("**********************************************************");
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }


    }
}
