package ex1;

import java.util.ArrayList;
import java.util.List;

public class OfficerManagement {
    private List<Officer> list = new ArrayList<>();
    private Validate valid = new Validate();

    public OfficerManagement() {
    }

    public void addOfficer(Officer officer) {
        list.add(officer);
    }

    public void findOfficerByName(String name) {
        list.stream().filter(a -> a.getName().equalsIgnoreCase(name)).forEach(System.out::println);
    }

    public void displayOfficer() {
        list.forEach(a -> System.out.println(a.toString()));
    }

    public int Menu() {
        System.out.println("Application Manage Officer");
        System.out.println("Enter 1: To insert officer");
        System.out.println("Enter 2: To search officer by name: ");
        System.out.println("Enter 3: To show information officers");
        System.out.println("Enter 4: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 4);
        return choice;
    }

    public void addType(int a, OfficerManagement officerManagement) {
        switch (a) {
            case 1: {
                System.out.print("Enter name: ");
                String name = valid.checkInputString();
                System.out.print("Enter age:");
                int age = valid.checkInputInt();
                System.out.print("Enter gender: ");
                String gender = valid.checkInputString();
                System.out.print("Enter address: ");
                String address = valid.checkInputString();
                System.out.print("Enter major: ");
                String major = valid.checkInputString();
                Officer engineer = new Engineer(name, age, gender, address, major);
                officerManagement.addOfficer(engineer);
                System.out.println(engineer.toString());
                break;

            }
            case 2: {
                System.out.print("Enter name: ");
                String name = valid.checkInputString();
                System.out.print("Enter age:");
                int age = valid.checkInputInt();
                System.out.print("Enter gender: ");
                String gender = valid.checkInputString();
                System.out.print("Enter address: ");
                String address = valid.checkInputString();
                System.out.print("Enter level: ");
                int level = valid.checkInputInt();
                Officer worker = new Worker(name, age, gender, address, level);
                officerManagement.addOfficer(worker);
                System.out.println(worker.toString());
                break;
            }
            case 3: {
                System.out.print("Enter name: ");
                String name = valid.checkInputString();
                System.out.print("Enter age:");
                int age = valid.checkInputInt();
                System.out.print("Enter gender: ");
                String gender = valid.checkInputString();
                System.out.print("Enter address: ");
                String address = valid.checkInputString();
                System.out.print("Enter work: ");
                String task = valid.checkInputString();
                Officer staff = new Staff(name, age, gender, address, task);
                officerManagement.addOfficer(staff);
                System.out.println(staff.toString());
                break;
            }
        }
    }
}








