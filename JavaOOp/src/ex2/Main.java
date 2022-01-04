package ex2;

import ex1.Validate;

public class Main {
    public static void main(String[] args) {
        Validate valid = new Validate();
        DocumentManagement doc = new DocumentManagement();
        while (true) {
            int choice = doc.Menu();
            switch (choice) {
                case 1: {
                    System.out.println("Enter 1: to insert Book");
                    System.out.println("Enter 2: to insert Newspaper");
                    System.out.println("Enter 3: to insert Magazine");
                    int type = valid.checkInputIntLimit(1, 3);
                    doc.addType(type, doc);
                    break;
                }
                case 2: {
                    System.out.println("Enter 1 to search book");
                    System.out.println("Enter 2 to search newspaper");
                    System.out.println("Enter 3 to search magazine");
                    int searchChoice = valid.checkInputIntLimit(1, 3);
                    doc.searchType(searchChoice, doc);
                    break;
                }
                case 3: {
                    doc.displayDocument();
                    break;
                }
                case 4: {
                    System.out.println("Input an ID to delete");
                    int id = valid.checkInputInt();
                    doc.deleteDocument(id);
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}
