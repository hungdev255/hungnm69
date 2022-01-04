package ex3;

import java.util.Scanner;

public class Candidate {
    private int IdNumber;
    private String name;
    private String adress;
    private String priorityPoint;

    public Candidate() {

    }

    public Candidate(int IdNumber, String Name, String adress, String priorityPoint) {
        this.IdNumber = IdNumber;
        this.name = Name;
        this.adress = adress;
        this.priorityPoint = priorityPoint;
    }

    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPriorityPoint() {
        return priorityPoint;
    }

    public void setPriorityPoint(String priorityPoint) {
        this.priorityPoint = priorityPoint;
    }

    public void inputCandidateInfor(Scanner sc) {
        System.out.print("Input Candidate ID number");
        IdNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Input Candidate Name ");
        name = sc.nextLine();
        System.out.print("Input Candidate adress");
        adress = sc.nextLine();
        System.out.print("Input Candidate Priority Point: ");
        priorityPoint = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Candidate{" + "IdNumber=" + IdNumber + ", name='" + name + '\'' + ", adress='" + adress + '\'' + ", priorityPoint='" + priorityPoint + '\'' + '}';
    }

    public int getIdNumber() {
        return IdNumber;
    }
}
