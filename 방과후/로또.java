package examAverage;
import java.util.Random;

public class LottoP {
	public static void main(String[] args) {
		// 로또 숫자 뽑아내기
		int[] lotto = new int[6];
		
		Random r = new Random();

		// 1~45 숫자 중에 랜덤으로 6개를 뽑아내라!
		lotto[0] = r.nextInt(44)+1;
		for(int i=1; i<lotto.length; i++) {
			lotto[i] = r.nextInt(44)+1;
			for(int j=i; j<=0; j--) { // i번째 이전의 수를 훑는 반복문
				// 중복이 있냐?				
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}				
		}
		
		for(int j=0; j<lotto.length; j++) {
			System.out.printf("%d  ", lotto[j]);
		}
		
		// 값을 정렬해보자 - 버블 정렬
		for(int a=1; a<lotto.length; a++) {
			for(int i=0; i<lotto.length-1; i++) {
				System.out.println(i+":");
				if(lotto[i]>lotto[i+1]) {
					int temp = lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1] = temp;
				}
			}			
		}
		
		
		// 값을 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%d  ", lotto[i]);
		}
		
		
	}
}
