package Day01.sec03;

public class Ex04 {

	public static void main(String[] args) {

		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		if(Double.isFinite(z1) || Double.isNaN(z2)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z1+z2);
		}
	}

}
