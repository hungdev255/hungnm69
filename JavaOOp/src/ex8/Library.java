package ex8;

import ex1.Validate;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Card> cards = new ArrayList<>();
    private Validate valid = new Validate();

    public void add(Card card) {
        cards.add(card);
    }

    public boolean delete(String id) {
        Card card = cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        cards.remove(card);
        return true;
    }
    public void displayCard() {
        cards.stream().forEach(System.out::println);
    }

    public int Menu() {
        System.out.println("Application Manage Card");
        System.out.println("Enter 1: To insert card");
        System.out.println("Enter 2: To remove card by id ");
        System.out.println("Enter 3: To get all card");
        System.out.println("Enter 4: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 4);
        return choice;
    }


}
