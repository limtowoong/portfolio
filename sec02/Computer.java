package Day04.sec02;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		return Math.PI * r * r;
	}

}
