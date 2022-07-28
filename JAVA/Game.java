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
		System.out.print("린을 쳐다본다.");
		enter();
		System.out.printf("%s : ( 귀여운 미소녀일 줄 알았는데 너무 코와이하자나? )", p2.getName());
		enter();
		System.out.printf("%s : 저 린짜ㅇ이 아니라 린사마 ㄷ..당신이 제 동료이신가요?", p1.getName());
		enter();
		System.out.printf("%s : 뭐야 이 씹덕새끼는?", p2.getName());
		enter();
		System.out.printf("%s : 이런 육수새끼가 내 동료라고?", p2.getName());
		enter();
		System.out.print("'나나가미 린'님께서 당신을 죽였습니다.");
		enter();
		System.out.print("Game Over");
		enter();
		System.out.print("계속하시겠습니까?");
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
		System.out.printf("%s : 안녕! %s아",p3.getName(), p1.getName());
		enter();
		System.out.printf("%s : (후욱후욱) 너무 카와이 하잖아? ", p1.getName());
		enter();
		System.out.printf("%s : ( 윽 역겨워 ) ", p3.getName());
		enter();
		System.out.printf("%s : 모모카짱 아..안녕?", p1.getName());
		enter();
		System.out.printf("%s : ( 으... ) 안녕^^ ", p3.getName());
		enter();
		System.out.printf("%s : %s아 우리 이세계를 구하러 가자!" , p3.getName(), p1.getName());
		enter();
		System.out.printf("%s : 이쿠죠! 모모카짱" , p1.getName());
		enter();
		System.out.printf("%s : ( 아.. 저 씹덕련.. ) " , p3.getName());
		enter();
		System.out.print("숲으로 들어왔다.");
		enter();
		System.out.print("시스템 : 야생의 '슬라임'이 출현하였습니다! ");
		enter();
		System.out.printf("%s : ( 모모카짱에게 멋진 모습을 보여줘야겠어 )", p1.getName());
		enter();
		System.out.printf("%s : 모모카짱! 내 뒤에 있어! ", p1.getName());
		enter();
		System.out.printf("%s : %s아 너무 멋져!! (육수련 좋댄다ㅋ) ", p3.getName(), p1.getName());
		enter();
		System.out.printf("%s : 간닷! 이야야야야 ", p1.getName());
		enter();
		System.out.printf("%s : 얍! ", p1.getName());
		enter();
		System.out.print("시스템 : 슬라임에게 0에 피해가 들어갔다");
		enter();
		System.out.printf("%s : 에엣 혼또? ", p1.getName());
		enter();
		System.out.print("슬라임이 점액발사를 시전하였다");
		enter();
		System.out.print("시스템 :" + p1.getName() + "님이 20에 피해를 입어 사망하셨습니다.");
		enter();
		System.out.print("Game Over");
		enter();
		System.out.print("계속하시겠습니까?");
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
		System.out.printf("%s : 안녕하세요 경석님 ", p4.getName());
		enter();
		System.out.printf("%s : 오하요 카야짱", p1.getName());
		enter();
		System.out.printf("%s : 네?", p4.getName());
		enter();
		System.out.printf("%s : (큿소 이런 실수해버렸다 )", p1.getName());
		enter();
		System.out.printf("%s : (웃으며) 재미있으시네요 ",p4.getName());
		enter();
		System.out.printf("%s : 아 맞다 %s님 제가 %s님을 위해 장비를 가져왔어요",p4.getName(), p1.getName(), p1.getName());
		enter();
		System.out.print("장비를 착용한다.");
		enter();
		System.out.printf("%s : 어? 카야짱 장비가 안 맞는거 같은데?");
		enter();
		System.out.printf("%s : ... ", p4.getName());
		enter();
		System.out.printf("%s : 크흠.. 괜찮아 카야짱 지방으로 감싸진 내 몸은 무적이라구!", p1.getName());
		enter();
		System.out.printf("%s : 나 방금 쫌 멋졌는데?", p1.getName());
		enter();
		System.out.printf("%s : 역시 %s님 듬직하시네요 ",p4.getName() , p1.getName());
		enter();
		System.out.print("몇년 후");
		enter();
		System.out.print("마왕 : 어리석은 닝겐들 여기가 어디라고 오느냐");
		enter();
		System.out.print("마왕 : 잠깐! 오호라..");
		enter();
		System.out.print("마왕 : 옆에 아주 아름다운 혜지를 대리고 다니는구나");
		enter();
		System.out.printf("%s : 닥쳐라! 이 가오충새끼 ",p1.getName());
		enter();
		System.out.printf("%s : 오늘 내가 너를 없애고 카나짱에게 청혼할거다!" , p1.getName());
		enter();
		System.out.printf("%s : 어맛!" ,	p4.getName());
		enter();
		System.out.print("마왕 : ㅈ같은 맨트하지 말고 덤벼라! ");
		enter();
		System.out.printf("마왕 : ㅈ같은 맨트하지 말고 덤벼라! ");
		enter();
		
		System.out.println(" 예(1) / 아니요(2) ");
		
		int exit = sc.nextInt();
		
		if(exit == 2) {
			System.exit(0);
		}
	}
	
	static void enter() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(1000);
	}

}
