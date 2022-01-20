package entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;
    private int manufactureYear;
    private double price;
    private String color;

    public Vehicle()
    {
    }

    public Vehicle(int id, String manufacturer, int manufactureYear, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
