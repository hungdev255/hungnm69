package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            int choice =hotel.Menu();
            switch(choice) {
                case 1: {
                    hotel.managePersonInHotel(hotel);
                    break;
                }
                case 2: {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case 3: {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    if(hotel.calculator(passport)==0){
                        System.out.println("Id is not exsit");
                    }else
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case 4: {
                    hotel.show();
                    break;
                }
                case 5: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}
