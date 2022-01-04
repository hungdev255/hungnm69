package ex3;

import java.util.Scanner;

public class GroupA extends Candidate {
    // thuoc tinh
    private String subject1;
    private String subject2;
    private String subject3;

    // phuong thuc
    // ham khoi tao khong doi so
    public GroupA() {

    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    // ham khoi tao co doi so
    public GroupA(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // ham nhap
    public void inputCandidateInfor(Scanner sc) {
        super.inputCandidateInfor(sc);
        System.out.print("Subject 1: ");
        subject1 = sc.nextLine();
        System.out.print("Subject 2: ");
        subject2 = sc.nextLine();
        System.out.print("Subject 3: ");
        subject3 = sc.nextLine();
    }

    @Override
    public String toString() {
        return "GroupA{" + "IdNumber=" + super.getIdNumber() + ", name='" + super.getName() + '\'' + ", adress='" + getAdress() + '\'' + ", priorityPoint='" + super.getPriorityPoint() + '\'' + "subject1='" + subject1 + '\'' + ", subject2='" + subject2 + '\'' + ", subject3='" + subject3 + '\'' + '}';
    }
}
