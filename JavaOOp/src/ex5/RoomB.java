package ex5;

public class RoomB extends Room{
    public RoomB() {
        super(300, "A");
    }
    @Override
    public String toString() {
        return "RoomB{" +
                "category='" + super.getCategory() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

}

