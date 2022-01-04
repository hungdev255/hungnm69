package ex5;

public class Room{
    private int price;
    private String category;

    public Room() {
    }

    public Room(int price, String category) {
        this.price = price;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
