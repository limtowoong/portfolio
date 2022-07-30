package newprj;

import java.util.Scanner;

public class Game {

	public void 린(Player p2) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player();
		
		System.out.print("시스템 : '나나가미 린'을 선택하셨습니다.");
		enter();
		System.out.print("시스템 : '나나가미 린'을 소환합니다.");
		enter();
		System.out.print(" 린을 쳐다본다. ");
		enter2();
		System.out.printf("%s : ( 귀여운 미소녀일 줄 알았는데 너무 코와이하자나? )", p2.getName());
		enter();
		System.out.printf("%s : 저 린짜ㅇ이 아니라 린사마 ㄷ..당신이 제 동료이신가요?", p1.getName());
		enter();
		System.out.printf("%s : 뭐야 이 씹덕새끼는?", p2.getName());
		enter();
		System.out.printf("%s : 이런 육수새끼가 내 동료라고?", p2.getName());
		enter();
		System.out.print(" '나나가미 린'님께서 당신을 죽였습니다. ");
		enter();
		System.out.print(" Game Over ");
		enter2();
		System.out.print(" 계속하시겠습니까? ");
		System.out.print(" 예(1) / 아니요(2) ");
		
		int exit = sc.nextInt();
		
		if(exit == 2) {
			System.exit(0);
		}
	}
		
	public void 모모카(Player p3) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
			
		Player p1 = new Player();
			
		System.out.print("시스템 : '유라기 모모카'을 선택하셨습니다.");
		enter();
		System.out.print("시스템 : '유라기 모모카'를 소환합니다.");
		enter();
		System.out.printf("%s : (후욱후욱) 너무 카와이 하잖아? ", p1.getName());
		enter();
		System.out.printf("%s : 윽 역겨워 ", p3.getName());
		enter2();
		System.out.printf("%s : 크윽 어떻게 그런말을 할 수가.. ", p1.getName());
		enter();
		System.out.printf("%s : 이런 돼지새끼랑 동료를 하라고?  ", p3.getName());
		enter();
		System.out.printf("%s : 나는 돼지가 아니야!", p1.getName());
		enter2();
		System.out.printf("%s : 한끼에 국밥 5그릇밖에 안 먹는다구!", p1.getName());
		enter();
		System.out.printf("%s : 하아... ", p3.getName());
		enter2();
		System.out.printf("%s : 너에게 기회를 줄께 ", p3.getName());
		enter2();
		System.out.printf("%s : 만약 하루에 국밥 한끼씩 먹고 애니를 안 본다면 동료가 되어줄께 ", p3.getName());
		enter();
		System.out.printf("%s : 손나 바카나 내 인생에 전부를 가져가다니 다메다요", p1.getName());
		enter();
		System.out.printf("%s : 우욱... 꺼져", p3.getName());
		enter2();
		System.out.print(" 동료가 떠났습니다. ");
		enter2();
	
		System.out.print(" Game Over ");
		enter2();
		System.out.print(" 계속하시겠습니까? ");
		System.out.print(" 예(1) / 아니요(2) ");
		
		int exit = sc.nextInt();
		
		if(exit == 2) {
			System.exit(0);
		}
	}
	
	public void 카야(Player p4) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
				
		Player p1 = new Player();
			
		System.out.print("시스템 : '시라누이 카야'을 선택하셨습니다.");
		enter();
		System.out.print("시스템 : '시라누이 카야'를 소환합니다.");
		enter();
		System.out.printf("%s : 안녕하세ㅇ... 까약 (찰싹)", p4.getName());
		enter();
		System.out.print(" 뺨을 맞았다 ");
		enter2();
		System.out.printf("%s : ( 아팠다.. 하지만.... ) ", p1.getName());
		enter();
		System.out.printf("%s : ( 기분은 좋은걸? 허헣 ) ", p1.getName());
		enter();
		System.out.printf("%s : ( 잠깐! 이게 아니지 ) ", p1.getName());
		enter();
		System.out.printf("%s : 왜.... 왜 그래 카야짱? ", p1.getName());
		enter();
		System.out.printf("%s : 죄송해요 너무 못생기셔서 저도 모르게 그만...", p4.getName());
		enter();
		System.out.printf("%s : ( 게임에서 초절정 미소녀들에게 인기남인 내가 이런 취급이라니.. ) ", p1.getName());
		enter();
		System.out.printf("%s : 흥.. 나 정도면 잘생긴거라능! ", p1.getName());
		enter();
		System.out.printf("%s : 아직 덜 맞으셨네요 ", p4.getName());
		enter();
		System.out.printf("%s : 히익 ", p1.getName());
		enter2();
		System.out.printf("%s : 조또마떼 카야짱 ", p1.getName());
		enter();
		
		System.out.print(" Game Over ");
		enter2();
		System.out.print(" 계속하시겠습니까? ");
		System.out.print(" 예(1) / 아니요(2) ");
		
		int exit = sc.nextInt();
		
		if(exit == 2) {
			System.exit(0);
		}
	}
	
	static void enter() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(3000);
	}
	
		static void enter2() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(2000);
	}

}
