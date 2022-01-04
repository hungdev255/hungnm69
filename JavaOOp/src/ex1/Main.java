package ex1;

public class Main {
    public static void main(String[] args) {
        Validate valid = new Validate();
        OfficerManagement officerManagement = new OfficerManagement();

        while (true) {
            int choice = officerManagement.Menu();
            switch (choice) {
                case 1: {
                    System.out.println("Enter 1: to add new Enginner");
                    System.out.println("Enter 2: to add new Worker");
                    System.out.println("Enter 3: to add new Staff");
                    int type= valid.checkInputIntLimit(1,3);
                    officerManagement.addType(type, officerManagement);
                    break;
                }
                case 2: {
                    System.out.print("Enter name to search: ");
                    String name = valid.checkInputString();
                    officerManagement.findOfficerByName(name);
                    break;
                }
                case 3 : {
                    officerManagement.displayOfficer();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
