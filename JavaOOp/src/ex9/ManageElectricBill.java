package ex9;

import ex1.Validate;

import java.util.ArrayList;
import java.util.List;

public class ManageElectricBill {
    private Validate valid = new Validate();
    private List<ElectricBill> electricBills = new ArrayList<>();

    public void add(ElectricBill bill) {
        electricBills.add(bill);
    }

    public boolean delete(String houseId) {
        ElectricBill bill = electricBills.stream().filter(t -> t.getHouseId().equalsIgnoreCase(houseId.toString())).findFirst().orElse(null);
        if (electricBills == null) {
            return false;
        }
        electricBills.remove(bill);
        return true;
    }

    public void display() {
        electricBills.stream().forEach(System.out::println);
    }

    public int Menu() {
        System.out.println("Application Manage Electric Bill");
        System.out.println("Enter 1: To insert new bill");
        System.out.println("Enter 2: To remove bill by house id ");
        System.out.println("Enter 3: To display");
        System.out.println("Enter 4: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 4);
        return choice;
    }
}
