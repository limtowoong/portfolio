package Day04.sec02;

public class SuperSonicEX extends Airplane{

	public static void main(String[] args) {
		SuperSonicA sa = new SuperSonicA();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicA.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicA.NORMAL;
		sa.fly();
		sa.land();
	}
	
}
