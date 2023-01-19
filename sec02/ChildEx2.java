package Day04.sec02;

public class ChildEx2 {

	public static void main(String[] args) {
		Parents2 parents  = new Child2();
		
		parents.field1 = "data1";
		parents.method1();
		parents.method1();
		
		Child2 child = (Child2) parents;
		
		child.field2 = "data2";
		child.method3();
	}
}
