package Day01.sec02;

public class Ex02 {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		System.out.println("x: "+x+" y: "+y);
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: "+x+" y: "+y);
	}

}
