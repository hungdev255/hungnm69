package ex5;

import ex1.Validate;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private Validate valid = new Validate();
    private List<Person> list= new ArrayList<>();


    public void add(Person person) {
        if (list.stream().anyMatch(d -> d.getPassport().equalsIgnoreCase(person.getPassport()))) {
            System.out.println("ID is already exist please try again");

        } else {
            list.add(person);
            System.out.println("Add Succsessfully");
        }
    }

    public void delete(String passport) {
        if (list.stream().anyMatch(d -> d.getPassport().equalsIgnoreCase(passport))) {
            list.removeIf(a -> a.getPassport().equalsIgnoreCase(passport));
            System.out.println("Delete Succsessfully");
        } else {
            System.out.println("ID is not exist please input again");
        }
    }

    public int calculator(String passport) {
        Person person = list.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (!list.stream().anyMatch(d -> d.getPassport().equalsIgnoreCase(passport))) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        list.forEach(p -> System.out.println(p.toString()));
    }

    public int Menu() {
        System.out.println("Application Manage Hotel");
        System.out.println("Enter 1: To insert person for rent");
        System.out.println("Enter 2: To remove person by passport");
        System.out.println("Enter 3: To calculator price by passport");
        System.out.println("Enter 4: To show infor");
        System.out.println("Enter 5: To exit:");
        int choice = valid.checkInputIntLimit(1, 5);
        return choice;
    }
    public void managePersonInHotel(Hotel h){
        System.out.print("Enter name: ");
        String name = valid.checkInputString();
        System.out.print("Enter age: ");
        int age = valid.checkInputInt();
        System.out.print("Enter passport: ");
        String passport = valid.checkInputString();
        System.out.println("Choise 1 to rent room type A");
        System.out.println("Choise 2 to rent room type B");
        System.out.println("Choise 3 to rent room type C");
        int choice = valid.checkInputIntLimit(1,3);
        Room room = new Room();
        switch (choice) {
            case 1:
                room = new RoomA();
                break;
            case 2:
                room = new RoomB();
                break;
            case 3:
                room = new RoomC();
                break;
        }

        System.out.print("Enter number day for rent: ");
        int numberRent = valid.checkInputInt();
        Person person = new Person(name, age, passport, room, numberRent);
        h.add(person);
    }
}

