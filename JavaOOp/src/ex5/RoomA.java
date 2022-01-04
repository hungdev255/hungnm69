package ex5;

public class RoomA extends Room{
    public RoomA() {
        super(500, "A");
    }
    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + super.getCategory() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

}
