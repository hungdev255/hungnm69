package service;

import entity.Car;
import entity.Motorbike;
import entity.Truck;
import entity.Vehicle;
import hibernate.HibernateManager;
import org.hibernate.Session;
import validate.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerVehicle {
    private final Scanner sc = new Scanner(System.in);
    private final Validate valid = new Validate();

    public Vehicle inputCar() {
        System.out.println("Input vehicle id:");
        int id = valid.checkInputInt();

        System.out.print("Input manufacturer:");
        String manufacturer = valid.checkInputString();

        System.out.print("Input manufacturer year:");
        int manufacturerYear = valid.checkInputInt();

        System.out.print("Input Price:");
        double price = valid.checkInputDouble();

        System.out.print("Input color:");
        String color = valid.checkInputString();

        System.out.print("Input number of seats:");
        int seatNumber = valid.checkInputInt();

        System.out.print("Input Engine Type:");
        String engineType = valid.checkInputString();

        return new Car(id, manufacturer, manufacturerYear, price, color, seatNumber, engineType);
    }

    public Vehicle inputMotorbike() {
        System.out.println("Input vehicle id:");
        int id = valid.checkInputInt();

        System.out.print("Input manufacturer:");
        String manufacturer = valid.checkInputString();

        System.out.print("Input manufacturer year:");
        int manufacturerYear = valid.checkInputInt();

        System.out.print("Input Price:");
        double price = valid.checkInputDouble();

        System.out.print("Input color:");
        String color = valid.checkInputString();

        System.out.print("Input wattage:");
        double wattage = valid.checkInputDouble();

        return new Motorbike(id, manufacturer, manufacturerYear, price, color, wattage);
    }

    public Vehicle inputTruck() {
        System.out.println("Input vehicle id:");
        int id = valid.checkInputInt();

        System.out.print("Input manufacturer:");
        String manufacturer = valid.checkInputString();

        System.out.print("Input manufacturer year:");
        int manufacturerYear = valid.checkInputInt();

        System.out.print("Input Price:");
        double price = valid.checkInputDouble();

        System.out.print("Input color:");
        String color = valid.checkInputString();

        System.out.print("Input tonnage:");
        double tonnage = valid.checkInputDouble();

        return new Truck(id, manufacturer, manufacturerYear, price, color, tonnage);
    }

    public void addVehicle() {
        try {
            Session session = HibernateManager.getSessionFactory().openSession();
            session.beginTransaction();
            while (true) {
                System.out.print("Choose the type of car (1-Truck,2-Motorbike,3-Car):");
                int chon = valid.checkInputIntLimit(1, 3);
                switch (chon) {
                    case 1: {
                        session.save(inputTruck());
                        break;
                    }
                    case 2: {
                        session.save(inputMotorbike());
                        break;
                    }
                    case 3: {
                        session.save(inputCar());
                        break;
                    }
                    default: {
                        session.save(inputTruck());
                        break;
                    }
                }
                System.out.println("Do you want to continue ?: (Y/N)");
                Boolean c = valid.checkInputYN();
                if (c == false) {
                    break;
                }
            }
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Vehicle> getVehicle() {
        try {
            Session session = HibernateManager.getSessionFactory().openSession();
            session.beginTransaction();
            List<Vehicle> list = session.createCriteria(Vehicle.class).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void searchByColor() {
        int count = 0;
        System.out.print("Input the color to search:");
        String searchColor = valid.checkInputString();
        List<Vehicle> list = getVehicle();
        if (list.stream().anyMatch(d -> d.getColor().equalsIgnoreCase(searchColor))) {
            list.stream().filter(a -> a.getColor().equalsIgnoreCase(searchColor)).forEach(System.out::println);
        } else {
            System.out.println("There is no match case");
        }
    }

    public void updateVehicle() {
        try {
            Session session = HibernateManager.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.print("Please enter the id you want to update:");
            int id = valid.checkInputInt();
            List<Vehicle> list = getVehicle();
            if (list.stream().anyMatch(d -> d.getId() == id)) {
                list.stream().filter(a -> a.getId() == id).forEach(System.out::println);
                Vehicle vehicle = session.get(Vehicle.class, id);
                System.out.println("Enter new color");
                String color = valid.checkInputString();
                vehicle.setColor(color);
                session.update(vehicle);
            } else {
                System.out.println("There is no match case");
            }
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteVehicle() {
        try {
            Session session = HibernateManager.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.print("Please enter the id you want to delete:");
            int id = valid.checkInputInt();
            List<Vehicle> list = getVehicle();
            if (list.stream().anyMatch(d -> d.getId() == id)) {
                list.stream().filter(a -> a.getId() == id).forEach(System.out::println);
                Vehicle vehicle = session.get(Vehicle.class, id);
                session.delete(vehicle);
                System.out.println("Remove successfully!");
            } else {
                System.out.println("There is no match case");
            }
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void displayVehicle() {
        List<Vehicle> list = getVehicle();
        if (list.isEmpty()) {
            System.out.println("There is no element");
        } else {
            list.stream().forEach(System.out::println);
        }
    }

    public int Menu() {
        System.out.println("Application Manage Vehicle");
        System.out.println("Enter 1: To insert new vehicle");
        System.out.println("Enter 2: To display all vehicle ");
        System.out.println("Enter 3: To update color by id");
        System.out.println("Enter 4: To search by color:");
        System.out.println("Enter 5: To delete by id:");
        System.out.println("Enter 6: Exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 6);
        return choice;
    }

    public void run() {
        while (true) {
            int choice = Menu();
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    updateVehicle();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    deleteVehicle();
                    break;
                case 6:
                    break;
            }
        }
    }
}
