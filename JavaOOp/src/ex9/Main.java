package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageElectricBill manageElectricBill = new ManageElectricBill();
        while (true) {
            int choice = manageElectricBill.Menu();
            switch (choice){
                case 1:
                    ElectricBill bill = new ElectricBill();
                    bill.inputBill();
                    manageElectricBill.add(bill);
                    break;
                case 2:
                    System.out.println("Enter house id you want to remove");
                    System.out.println("Input house id:");
                    String idRemove = scanner.nextLine();
                    manageElectricBill.delete(idRemove);
                    break;
                case 3:
                    System.out.println("Display bill");
                    manageElectricBill.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
