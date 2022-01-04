package ex12;

public class Truck extends Vehicle{
    private double tonnage;

    public Truck()
    {
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String id, String manufacturer, int manufactureYear, double price, String color, double tonnage) {
        super(id, manufacturer, manufactureYear, price, color);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "tonnage=" + tonnage +
                '}';
    }
}
