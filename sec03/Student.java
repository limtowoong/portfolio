package Day04.sec03;

public class Student extends Person{

	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("���θ� �����մϴ�.");
	}
}
