package entity;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "vid")
public class Motorbike extends Vehicle{

    private double wattage;

    public Motorbike() {
    }

    public Motorbike(int id, String manufacturer, int manufactureYear, double price, String color, double wattage) {
        super(id, manufacturer, manufactureYear, price, color);
        wattage = wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public double getWattage() {
        return this.wattage;
    }

    @Override
    public String toString() {
        return super.toString()+ "Motorbike{" +
                "Wattage=" + wattage +
                '}';
    }
}

