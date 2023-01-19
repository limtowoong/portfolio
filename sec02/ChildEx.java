package Day04.sec02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parents parents = child;
		
		parents.method1();
		parents.method2();
	}
}
