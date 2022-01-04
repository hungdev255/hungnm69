package ex6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class c = new Class();

        c.add(new Student("Long", 20, "DN"));
        c.add(new Student("Hung", 23, "DN"));
        c.add(new Student("Hai", 23, "DL"));

        System.out.println(c.getStudent20YearOld());
        System.out.println(c.countStudent23YearOldInDN());
    }
}

