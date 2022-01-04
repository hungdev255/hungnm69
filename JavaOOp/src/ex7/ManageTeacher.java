package ex7;

import ex1.Validate;

import java.util.ArrayList;
import java.util.List;

public class ManageTeacher {
    private List<Teacher> teachers;
    private Validate valid = new Validate();
    public ManageTeacher() {
        this.teachers = new ArrayList<>();
    }

    public void add(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void deleteById(String id) {
        if (teachers.stream().anyMatch(d -> d.getId().equalsIgnoreCase(id))) {
            teachers.removeIf(a -> a.getId().equalsIgnoreCase(id));
            System.out.println("Delete Succsessfully");
        } else {
            System.out.println("ID is not exist please input again");
        }
    }

    public double getSalary(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getSalary() + teacher.getBonus() + teacher.getPenaty();

    }

    public int Menu() {
        System.out.println("Application Manage Teacher");
        System.out.println("Enter 1: To insert teacher");
        System.out.println("Enter 2: To remove teacher by id ");
        System.out.println("Enter 3: To get teacher salary");
        System.out.println("Enter 4: To exit:");
        System.out.print("Enter your choice: ");
        int choice = valid.checkInputIntLimit(1, 4);
        return choice;
    }
}

