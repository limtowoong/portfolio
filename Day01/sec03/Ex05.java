package Day01.sec03;

public class Ex05 {

	public static void main(String[] args) {

		int charcode = 'a';
//		A 유니코드 65
//		a 유니코드 97
		
		if((65<=charcode) & (charcode<=90)) {
			System.out.println("대문자");
		}
		
		if((97<=charcode) & (charcode<=122)) {
			System.out.println("소문자");
		}
		
		int value = 6;
		if((value %2 == 0) || (value%3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
	}

}
