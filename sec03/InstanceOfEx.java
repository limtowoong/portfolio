package Day04.sec03;

public class InstanceOfEx {

	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿");
		
		Person p2 = new Student("±è±æµ¿", 10);
		
		p1.walk();
		p2.walk();
		
		if(p1 instanceof Student) {
			Student student = (Student) p1;
			System.out.print("p1: ");
			student.study();
		}
		
		if(p2 instanceof Student) {
			Student student = (Student) p2;
			System.out.print("p2: ");
			student.study();
		}
	}
}
