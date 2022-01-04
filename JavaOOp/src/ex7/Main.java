package ex7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageTeacher managerTeacher = new ManageTeacher();
        while (true) {
            int choice = managerTeacher.Menu();
            switch (choice){
                case 1:
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input hometown:");
                    String hometown = scanner.nextLine();
                    System.out.println("Input id:");
                    String id = scanner.nextLine();
                    System.out.println("Input salary:");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input bonus:");
                    double bonus = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input penaty:");
                    double penaty = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input real salary:");
                    double realSalary = Double.parseDouble(scanner.nextLine());
                    Human human = new Teacher(name,age,hometown,id,salary,bonus,penaty,realSalary);
                    managerTeacher.add((Teacher) human);
                    break;
                case 2:
                    System.out.println("Enter teacher id you want to remove");
                    System.out.println("Input id:");
                    String idRemove = scanner.nextLine();
                    managerTeacher.deleteById(idRemove);
                    break;
                case 3:
                    System.out.println("Enter teach id to find his/her salary");
                    System.out.println("Input id:");
                    String idToSearch = scanner.nextLine();
                    if(managerTeacher.getSalary(idToSearch)==0){
                        System.out.println("Id is not exsit");
                    }else
                    System.out.println(managerTeacher.getSalary(idToSearch));
                    break;
                case 4:
                    return;
            }
        }
    }

}
