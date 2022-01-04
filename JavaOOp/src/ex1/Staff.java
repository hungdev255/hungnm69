package ex1;

public class Staff extends Officer{
    private String work;

    public Staff(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    public Staff() {
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "level=" + work +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
