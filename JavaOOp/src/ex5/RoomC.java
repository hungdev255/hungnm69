package ex5;

public class RoomC extends Room{
    public RoomC() {
        super(100, "A");
    }
    @Override
    public String toString() {
        return "RoomC{" +
                "category='" + super.getCategory() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

}

