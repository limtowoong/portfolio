package examAverage;
import java.util.Random;

public class LottoP {
	public static void main(String[] args) {
		// �ζ� ���� �̾Ƴ���
		int[] lotto = new int[6];
		
		Random r = new Random();

		// 1~45 ���� �߿� �������� 6���� �̾Ƴ���!
		lotto[0] = r.nextInt(44)+1;
		for(int i=1; i<lotto.length; i++) {
			lotto[i] = r.nextInt(44)+1;
			for(int j=i; j<=0; j--) { // i��° ������ ���� �ȴ� �ݺ���
				// �ߺ��� �ֳ�?				
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}				
		}
		
		for(int j=0; j<lotto.length; j++) {
			System.out.printf("%d  ", lotto[j]);
		}
		
		// ���� �����غ��� - ���� ����
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
		
		
		// ���� ���
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%d  ", lotto[i]);
		}
		
		
	}
}