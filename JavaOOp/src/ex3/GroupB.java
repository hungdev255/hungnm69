package ex3;

public class GroupB extends GroupA {
    public GroupB() {

    }

    public GroupB(String mon1, String mon2, String mon3) {
        super(mon1, mon2, mon3);
    }

    @Override
    public String toString() {
        return "GroupB{" +
                "IdNumber=" + super.getIdNumber() +
                ", name='" + super.getName() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", priorityPoint='" + super.getPriorityPoint() + '\'' +
                "subject1='" + super.getSubject1() + '\'' +
                ", subject2='" + super.getSubject2() + '\'' +
                ", subject3='" + super.getSubject3() + '\'' +
                '}';
    }
}
