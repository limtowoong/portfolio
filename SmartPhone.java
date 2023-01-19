package Day04;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태가 변경되었습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
