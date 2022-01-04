package ex3;

import ex1.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class Admissions {
    private Validate valid = new Validate();
    private ArrayList<Candidate> list;

    public Admissions() {
        list = new ArrayList<Candidate>();
    }

    public void addCandidate(Candidate ts) {
        if (list.stream().anyMatch(d -> d.getIdNumber() == ts.getIdNumber())) {
            System.out.println("ID is already exist please try again");

        } else {
            list.add(ts);
            System.out.println("Add Succsessfully");
        }
    }

    public void nhapDanhSach(Scanner sc) {
        Candidate ts;
        int choice;

        System.out.print("How many candidate do you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Choose the group:");
            System.out.println("1-GroupA");
            System.out.println("2-GroupB");
            System.out.println("3-GroupC");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ts = new GroupA("Math", "Physics", "Chemistry");
                    break;
                case 2:
                    ts = new GroupB("Math", "Chemistry", "Biological");
                    break;
                case 3:
                    ts = new GroupC("Literature", "History", "Geography");
                    break;
                default:
                    ts = new GroupA("Math", "Physics", "Chemistry");
                    break;
            }

            ts.inputCandidateInfor(sc);
            addCandidate(ts);
        }
    }

    public void display() {
        list.forEach(a -> System.out.println(a.toString()));

    }

    public void searchByIdNumber(int idNumber) {
        list.stream().filter(a -> a.getIdNumber() == idNumber).forEach(System.out::println);
    }

    public int Menu() {
        System.out.println("Application Manager Candidate");
        System.out.println("Enter 1: To insert Candidate");
        System.out.println("Enter 2: To search Candidate by id number: ");
        System.out.println("Enter 3: To show information documents");
        System.out.println("Enter 4: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 4);
        return choice;
    }

}
