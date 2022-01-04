package ex11;

import java.util.Scanner;

public class Main {

    public void menu() {
        System.out.println("Application Calculate Complex Number");
        System.out.println("1.Enter the complex number");
        System.out.println("2.Sum the complex numbers");
        System.out.println("3.Multiple the  complex numbers");
        System.out.println("4.Exit");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculate;
        Main m= new Main();
        ComplexNumber complexNumber1 = new ComplexNumber();
        ComplexNumber complexNumber2 = new ComplexNumber();
        int choose;
        while (true) {
            m.menu();
            System.out.print("Enter yours selection : ");
            choose = input.nextInt();
            calculate = new Calculator();

            switch (choose) {
                case 1:
                    complexNumber1 = calculate.inputNumb();
                    complexNumber2 = calculate.inputNumb();
                    complexNumber1.showComNumb();
                    complexNumber2.showComNumb();
                    break;
                case 2:
                    Calculator.additionNumb(complexNumber1, complexNumber2);
                    break;
                case 3:
                    Calculator.multiply(complexNumber1, complexNumber2);
                    break;
                case 4:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.out.println("Your selection does not match. Please enter again!");
                    System.out.println("Enter yours selection(from 1 to 4) : ");
                    break;
            }
        }
    }
}
