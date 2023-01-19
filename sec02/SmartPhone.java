package Day04.sec02;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("자식 생성자 호출");
	}
	
}
