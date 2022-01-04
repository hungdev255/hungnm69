package ex3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Admissions dsAdmissions = new Admissions();
        while (true) {
            int choice = dsAdmissions.Menu();
            switch (choice) {
                case 1: {
                    dsAdmissions.nhapDanhSach(sc);
                    break;
                }
                case 2: {
                    System.out.print("Input the id number you want to find: ");
                    int soBaoDanh = sc.nextInt();
                    sc.nextLine();
                    dsAdmissions.searchByIdNumber(soBaoDanh);
                    break;
                }
                case 3: {
                    System.out.println("Danh sach thi sinh du thi la:");
                    dsAdmissions.display();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }


    }

}
