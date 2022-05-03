import java.util.Random;
import java.util.Scanner;

public class baseballgame_0420 {

	public static void main(String[] args) {
		int num[] = new int[3]; //num에 배열 3개 선언
		int answer[] = new int[3]; //answer에 배열 3개 선언
		Random r = new Random();
		
		while(true) {
			while(true){
				num[0] = r.nextInt(9)+1; //0번에 있는 num 배열에 난수를 넣음 (배열은 0번부터 시작)
				num[1] = r.nextInt(9)+1;
				num[2] = r.nextInt(9)+1; 
				if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {	//배열에 중복값 제거
					break;
				}
			}
			
			// for(int i=0; i<num.length; i++){	//i를 num에 배열 길이만큼 반복함
			// 	System.out.print(num[i]+" ");	//num에 i번째 배열을 출력
			// }
			System.out.println("");
			
			Scanner sc = new Scanner(System.in);
		
			while(true) {
				int strike = 0; //스트라이크 생성 (상대 숫자와 내 숫자에 자리가 같으면 1 아니면 0)
				int ball = 0; //볼 생성 (내 숫자가 상대 숫자에도 있으면 1 아니면 0)
				
				System.out.print("숫자 3개를 입력해주세요(띄어쓰기로 구분)");
				answer[0] = sc.nextInt(); //0번에 있는 answer 배열에 원하는 수를 넣음
				answer[1] = sc.nextInt();
				answer[2] = sc.nextInt();
				
				// strike를 판단하는 조건문
				for(int i=0; i<answer.length; i++) {		//i를 answer 배열 길이만큼 반복
					if(num[i]==answer[i]) {			//num 배열 i번째와 answer 배열 i번째에 값이 같으면 true
						strike++;		//스트라이크 값에 1을 더함
					}
				}
				// ball을 판단하는 조건문
				if(num[0]==answer[1]||num[0]==answer[2]) ball++;		//0번과 1번 또는 0번과 2번이 같으면 볼값 +1
				if(num[1]==answer[0]||num[1]==answer[2]) ball++;		//1번과 0번 또는 1번과 2번이 같으면 볼값 +1
				if(num[2]==answer[0]||num[2]==answer[1]) ball++;		//2번과 0번 또는 2번과 1번이 같으면 볼값 +1
				
				System.out.println(strike+" 스트라이크! "+ball+" 볼!");
				
				if(strike==3) {
					System.out.println("ㅊㅋ");
					break;
				}
			}
			//게임을 다시할지 말지 정하는 조건문
			System.out.println("한판 더?"->아무숫자, "끝"->2);
			int restart = sc.nextInt();
			if(restart==2) {
				System.out.println("게임을 종료합니다");
				System.exit(0);
				break;
			} else {
				System.out.println("게임을 다시 시작합니다");			
			}
		}
	}

}
