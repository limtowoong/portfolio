package ffff;

import java.util.Random;
import java.util.Scanner;

public class baseballgame_0420 {

	public static void main(String[] args) {
		int num[] = new int[3];
		int answer[] = new int[3];
		Random r = new Random();
		
		while(true) {
			while(true){
				num[0] = r.nextInt(9)+1;
				num[1] = r.nextInt(9)+1;
				num[2] = r.nextInt(9)+1;
				if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
					break;
				}
			}
			
			// for(int i=0; i<num.length; i++){
			// 	System.out.print(num[i]+" ");
			// }
			System.out.println("");
			
			Scanner sc = new Scanner(System.in);
		
			while(true) {
				int strike = 0;
				int ball = 0;
				
				System.out.print("���� 3���� �Է����ּ���(����� ����)");
				answer[0] = sc.nextInt();
				answer[1] = sc.nextInt();
				answer[2] = sc.nextInt();
				
				// strike�� �Ǵ��ϴ� ���ǹ�
				for(int i=0; i<answer.length; i++) {
					if(num[i]==answer[i]) {
						strike++;
					}
				}
				// ball�� �Ǵ��ϴ� ���ǹ�
				if(num[0]==answer[1]||num[0]==answer[2]) ball++;
				if(num[1]==answer[0]||num[1]==answer[2]) ball++;
				if(num[2]==answer[0]||num[2]==answer[1]) ball++;
				
				System.out.println(strike+" ��Ʈ����ũ! "+ball+" ��!");
				
				if(strike==3) {
					System.out.println("����");
					break;
				}
			}
			// �Ѱ״�?
			System.out.println("���� ���ҷ�? ����->�ƹ�����, ����->2");
			int restart = sc.nextInt();
			if(restart==2) {
				System.out.println("������ �����մϴ�~~");
				System.exit(0);
				break;
			} else {
				System.out.println("������ �ٽ� �����մϴ�!!");			
			}
		}
	}

}