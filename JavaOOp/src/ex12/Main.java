package ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ManageVehicle PT=new ManageVehicle();
        Scanner sc=new Scanner(System.in);
        PT.nhapDangKiPhuongTien(sc);
        PT.searchByColor(sc);
        PT.searchByManufactureYear(sc);
    }
}
