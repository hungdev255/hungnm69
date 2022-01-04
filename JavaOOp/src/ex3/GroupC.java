package ex3;

public class GroupC extends GroupA {
	// thuoc tinh

	// phuong thuc
	// ham khoi tao
	public GroupC() {

	}

	public GroupC(String mon1, String mon2, String mon3) {
		super(mon1, mon2, mon3);
	}

	public String toString() {
		return "GroupC{" +
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
