package ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageVehicle {
    private ArrayList<Vehicle> ds=new ArrayList();

    public Vehicle inputCar(Scanner sc)
    {
        System.out.println("Input vehicle id:");
        String id=sc.nextLine();

        System.out.print("Input manufacturer:");
        String manufacturer=sc.nextLine();

        System.out.print("Input manufacturer year:");
        int manufacturerYear=Integer.parseInt(sc.nextLine());

        System.out.print("Input Price:");
        double price=Double.parseDouble(sc.nextLine());

        System.out.print("Input color:");
        String color=sc.nextLine();

        System.out.print("Input number of seats:");
        int seatNumber=Integer.parseInt(sc.nextLine());

        System.out.print("Input Engine Type:");
        String engineType=sc.nextLine();

        return new Car(id,manufacturer,manufacturerYear,price,color,seatNumber,engineType);
    }
    public Vehicle inputMotorbike(Scanner sc)
    {
        System.out.println("Input vehicle id:");
        String id=sc.nextLine();

        System.out.print("Input manufacturer:");
        String manufacturer=sc.nextLine();

        System.out.print("Input manufacturer year:");
        int manufacturerYear=Integer.parseInt(sc.nextLine());

        System.out.print("Input Price:");
        double price=Double.parseDouble(sc.nextLine());

        System.out.print("Input color:");
        String color=sc.nextLine();

        System.out.print("Input wattage:");
        double wattage=sc.nextDouble();

        return new Motorbike(id,manufacturer,manufacturerYear,price,color,wattage);
    }
    public Vehicle inputTruck(Scanner sc)
    {
        System.out.println("Input vehicle id:");
        String id=sc.nextLine();

        System.out.print("Input manufacturer:");
        String manufacturer=sc.nextLine();

        System.out.print("Input manufacturer year:");
        int manufacturerYear=Integer.parseInt(sc.nextLine());

        System.out.print("Input Price:");
        double price=Double.parseDouble(sc.nextLine());

        System.out.print("Input color:");
        String color=sc.nextLine();

        System.out.print("Input tonnage:");
        double tonnage=Double.parseDouble(sc.nextLine());

        return new Truck(id,manufacturer,manufacturerYear,price,color,tonnage);
    }
    public void  nhapDangKiPhuongTien(Scanner sc)
    {
        char c;
        int chon=0;
        while(true)
        {
            System.out.print("Ban muon nhap loai xe nao (1-Truck,2-Motorbike,3-Car):");
            chon=sc.nextInt();
            sc.nextLine();
            switch(chon)
            {
                case 1:{
                    ds.add(inputTruck(sc));
                    break;
                }
                case 2:{
                    ds.add(inputMotorbike(sc));
                    break;
                }
                case 3:{
                    ds.add(inputCar(sc));
                    break;
                }
                default:
                {
                    ds.add(inputTruck(sc));
                    break;
                }
            }
            System.out.println("Ban co muon nhap nua khong: (Y/N)");
            c=sc.nextLine().charAt(0);
            if(c=='N'||c=='n')
                break;
        }
    }
    public void searchByColor(Scanner sc)
    {
        System.out.print("Input the color to search:");
        String mauTk=sc.nextLine();
        for(int i=0;i < ds.size();i++)
        {
            String mau=ds.get(i).getColor();
            if(mau.equalsIgnoreCase(mauTk))
                System.out.println(ds.get(i).toString());
        }
    }
    public void searchByManufactureYear(Scanner sc)
    {
        System.out.print("Nhap nam  de tim kiem:");
        int nam=sc.nextInt();
        int tg=0;
        for(int i=0;i < ds.size();i++)
        {
            tg=ds.get(i).getManufactureYear();
            if(tg==nam)
                System.out.println(ds.get(i).toString());
        }
    }
}
