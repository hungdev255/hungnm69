package ex8;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String stClass;

    public Student(String name, int age, String stClass) {
        this.name = name;
        this.age = age;
        this.stClass = stClass;
    }
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name ");
        name = scanner.nextLine();
        setName(name);
        System.out.print("Input age ");
        age = Integer.parseInt(scanner.nextLine());
        setAge(age);
        System.out.print("Input Student Class");
        stClass = scanner.nextLine();
        setStClass(stClass);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stClass='" + stClass + '\'' +
                '}';
    }
}

