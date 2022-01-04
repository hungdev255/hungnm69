package ex9;

import ex1.Validate;

import java.util.Scanner;

public class ElectricBill extends Customer{

    private int oldNumber;
    private int newNumber;
    private double payment;
    private Customer customer;

    public ElectricBill() {
    }

    public ElectricBill(String FamilyName, String houseId, int electricId) {
        super(FamilyName, houseId, electricId);
    }

    public ElectricBill(String FamilyName, String houseId, int electricId, int oldNumber, int newNumber, double payment, Customer customer) {
        super(FamilyName, houseId, electricId);
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.payment = payment;
        this.customer = customer;
    }

    public ElectricBill(int oldNumber, int newNumber, double payment, Customer customer) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.payment = payment;
        this.customer = customer;
    }



    public void inputBill() {
        customer = new Customer();
        customer.inputNewCustomer();
        setCustomer(customer);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input old number: ");
            oldNumber = scanner.nextInt();
            setOldNumber(oldNumber);
            System.out.print("Input new number: ");
            newNumber = scanner.nextInt();
            setNewNumber(newNumber);
        } while (oldNumber > newNumber);

        payment = (double) (newNumber - oldNumber) * 5;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", payment=" + payment +
                ", customer=" + customer +
                '}';
    }
}

