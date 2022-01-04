package ex9;

import java.util.Scanner;

public class Customer {
    private String familyName;
    private String houseId;
    private int electricId;

    public Customer() {
    }

    public Customer(String FamilyName, String houseId, int electricId) {
        this.familyName = FamilyName;
        this.houseId = houseId;
        this.electricId = electricId;
    }

    public void inputNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Family name ");
        familyName = scanner.nextLine();
        setFamilyName(familyName);
        System.out.print("Input house id: ");
        houseId = scanner.nextLine();
        setHouseId(houseId);
        System.out.print("Input electric id: ");
        electricId = scanner.nextInt();
        setElectricId(electricId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "familyName='" + familyName + '\'' +
                ", houseId='" + houseId + '\'' +
                ", electricId=" + electricId +
                '}';
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public int getElectricId() {
        return electricId;
    }

    public void setElectricId(int electricId) {
        this.electricId = electricId;
    }
}
