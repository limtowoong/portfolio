package Day04.sec02;

public class Car {
	public int speed;
	
	public void speedup() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃä´Ï´Ù.");
		speed = 0;
	}
}
