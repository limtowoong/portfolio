package Day04.sec02;

public class Car {
	public int speed;
	
	public void speedup() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("���� ����ϴ�.");
		speed = 0;
	}
}
