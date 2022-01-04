package ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    ComplexNumber complexNumber = new ComplexNumber();
    ArrayList<ComplexNumber> arrayListComNumb = new ArrayList<ComplexNumber>();

    public ComplexNumber inputNumb() {
        System.out.print("Enter the complex number real of number : ");
        double real = input.nextDouble();
        System.out.print("Enter the complex number real imaginary : ");
        double imaginary = input.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public static void displayNumb(ComplexNumber complexNumber) {
        System.out.println("The two complex numbers you just entered are : ");
        complexNumber.showComNumb();
    }

    public static void additionNumb(ComplexNumber numb1, ComplexNumber numb2) {
        double real       = numb1.getReal() + numb2.getReal();
        double imaginary  = numb1.getImaginary() + numb2.getImaginary();
        ComplexNumber sum = new ComplexNumber(real, imaginary);
        System.out.print("The sum of the two complex numbers just entered is : ");
        sum.showComNumb();

    }

    public static void multiply(ComplexNumber numb1, ComplexNumber numb2) {
        double real       = numb1.getReal() * numb2.getReal() - numb1.getImaginary() * numb2.getImaginary();
        double imaginary  = numb1.getReal() * numb2.getImaginary() + numb1.getImaginary() * numb2.getReal();
        ComplexNumber multiply = new ComplexNumber(real, imaginary);
        System.out.print("Product of two complex numbers just entered is : ");
        multiply.showComNumb();
    }
}
