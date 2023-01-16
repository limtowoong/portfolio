package Day01.sec04;

public class Ex06 {

	public static void main(String[] args) {

		int time = (int)(Math.random()*4) + 8;
		
		switch (time) {
		case 8:
			System.out.println("출근 합니다.");
			break;
		case 9:
			System.out.println("외근 합니다.");
			break;
		case 10:
			System.out.println("야근 합니다.");
			break;
		case 11:
			System.out.println("퇴근 합니다.");
			break;
		}
	}
}
