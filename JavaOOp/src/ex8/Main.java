package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            int choice = library.Menu();
            switch (choice){
                case 1:
                    Student student = new Student();
                    student.inputStudent();

                    System.out.println("Input id");
                    String id = scanner.nextLine();
                    System.out.println("Input borrow date:");
                    int brDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input payment date:");
                    int payDate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input bookId:");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    library.add(new Card(student,id,brDate,payDate,bookId));
                    break;
                case 2:
                    System.out.println("Enter card id you want to remove");
                    System.out.println("Input id:");
                    String idRemove = scanner.nextLine();
                    library.delete(idRemove);
                    break;
                case 3:
                    System.out.println("Display card list");
                    library.displayCard();
                    break;
                case 4:
                    return;
            }
        }
    }
}

