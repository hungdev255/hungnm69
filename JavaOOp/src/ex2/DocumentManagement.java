package ex2;

import ex1.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DocumentManagement {
    private Validate valid = new Validate();
    private List<Document> list = new ArrayList<>();

    public void addDocument(Document document) {
        if (list.stream().anyMatch(d -> d.getId() == document.getId())) {
            System.out.println("ID is already exist please try again");

        } else {
            list.add(document);
            System.out.println("Add Succsessfully");
        }
    }

    public void deleteDocument(int id) {
        if (list.stream().anyMatch(d -> d.getId() == id)) {
            list.removeIf(a -> a.getId() == id);
            System.out.println("Delete Succsessfully");
        } else {
            System.out.println("ID is not exist please input again");
        }
    }

    public void displayDocument() {
        list.forEach(a -> System.out.println(a.toString()));
    }

    public int Menu() {
        System.out.println("Application Manager Document");
        System.out.println("Enter 1: To insert document");
        System.out.println("Enter 2: To search document by category: ");
        System.out.println("Enter 3: To show information documents");
        System.out.println("Enter 4: To remove document by id");
        System.out.println("Enter 5: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 5);
        return choice;
    }

    public void addType(int a, DocumentManagement docManagement) {
        switch (a) {
            case 1: {
                System.out.print("Enter ID: ");
                int id = valid.checkInputInt();
                System.out.print("Enter imprint:");
                String imprint = valid.checkInputString();
                System.out.print("Enter Released Number: ");
                int releasedNumber = valid.checkInputInt();
                System.out.print("Enter Athour Name: ");
                String author = valid.checkInputString();
                System.out.print("Enter page number of age: ");
                int numberOfPage = valid.checkInputInt();
                Document book = new Book(id, imprint, releasedNumber, author, numberOfPage);
                docManagement.addDocument(book);
                System.out.println(book.toString());
                break;
            }
            case 2: {
                System.out.print("Enter ID: ");
                int id = valid.checkInputInt();
                System.out.print("Enter imprint:");
                String imprint = valid.checkInputString();
                System.out.print("Enter Released Number: ");
                int releasedNumber = valid.checkInputInt();
                System.out.print("Enter Released Day: ");
                String releasedDay = valid.checkInputString();
                Document newspaper = new Newspaper(id, imprint, releasedNumber, releasedDay);
                docManagement.addDocument(newspaper);
                System.out.println(newspaper.toString());
                break;

            }
            case 3: {
                System.out.print("Enter ID: ");
                int id = valid.checkInputInt();
                System.out.print("Enter imprint:");
                String imprint = valid.checkInputString();
                System.out.print("Enter Released Number: ");
                int releasedNumber = valid.checkInputInt();
                System.out.print("Enter issue number : ");
                int issueNumber = valid.checkInputInt();
                System.out.print("Enter issue month : ");
                int releasedMonth = valid.checkInputInt();
                Document magazine = new Magazine(id, imprint, releasedNumber, issueNumber, releasedMonth);
                docManagement.addDocument(magazine);
                System.out.println(magazine.toString());
                break;

            }
        }
    }

    public void searchType(int choice, DocumentManagement docManagement) {
        switch (choice) {
            case 1: {
                Document book = new Book();
                book.search((ArrayList<Document>) list);
                break;
            }
            case 2: {
                Document newspaper = new Newspaper();
                newspaper.search((ArrayList<Document>) list);
                break;
            }
            case 3: {
                Document magazine = new Magazine();
                magazine.search((ArrayList<Document>) list);
                break;
            }
        }
    }

}
