package Day04.sec02;

public class Child extends Parents{

	@Override
	public void method2() {
		System.out.println("자식-method2()");
		super.method1();
	}

	public void method3() {
		System.out.println("자식-method3()");
	}
}
