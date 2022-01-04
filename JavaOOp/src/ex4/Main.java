package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();

            List<Person> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < number; j++) {
                System.out.println("Enter person name");
                String name = scanner.nextLine();
                System.out.println("Enter person age");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter person job");
                String job = scanner.nextLine();
                System.out.println("Enter person passport");
                String passport = scanner.nextLine();
                persons.add(new Person(name, age, job, passport));
            }

            town.addFamily(new Family(persons, address));
            System.out.println(town);

        }
    }
}


