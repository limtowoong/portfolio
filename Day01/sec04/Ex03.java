package Day01.sec04;

public class Ex03 {

	public static void main(String[] args) {

		int score = 80;
		
		if(score >= 90) {
			System.out.println("점수가 90이상 입니다.");
			System.out.println("등급은 A 입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 80이상 입니다.");
			System.out.println("등급은 B 입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 70이상 입니다.");
			System.out.println("등급은 C 입니다.");
		}else {
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

}
