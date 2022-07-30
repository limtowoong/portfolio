package newprj;
import java.util.Scanner;

public class Prj {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player(player1);
		
		enter2();
		System.out.printf("%s : 아 오늘도 힘들었다", p1.getName());
		enter3();
		System.out.printf("%s : 집가서 게임( 미연시 ) 해야지ㅎㅎ", p1.getName());
		enter();
		System.out.print(" 땀을 흘리며 집에 들어간다 ");
		enter3();
		System.out.printf("%s : ( 게임를 키며 ) 미카짱 오늘도 많이 기다렸지?", p1.getName());
		enter();
		System.out.printf("미카 : 왜이렇게 늦었어 %s쿤!" ,p1.getName());
		enter3();
		System.out.printf("%s : 고..고맨 미카짱", p1.getName());
		enter2();
		System.out.printf("%s : ㅇ..와타시 학교 때문에 느..늦어버렸다랄까나?", p1.getName());
		enter();
		System.out.printf("미카 : 괜찮아 %s쿤!" , p1.getName());
		enter2();
		System.out.printf("미카 : %s쿤 오늘은 어디갈까?" , p1.getName());
		enter3();
		System.out.printf("%s : 어... ", p1.getName());
		enter2();
		System.out.printf("%s : 국밥집? ", p1.getName());
		enter2();
		System.out.print("미카 : 좋아! ");
		enter2();
		System.out.print("시스템 : 국밥집으로 이동하시겠습니까?");
		enter();
		System.out.print("확인을 누른다.");
		enter2();
		System.out.printf("%s : 미카짱 도착했어! ", p1.getName());
		enter();
		System.out.print("미카 : ... ");
		enter2();
		System.out.printf("%s : 미카짱 표정이 왜그래...? ", p1.getName());
		enter3();
		System.out.printf("미카 : 고맨.. %s쿤.. ", p1.getName());
		enter3();
		System.out.print("( 푸슉 )");
		enter2();
		System.out.printf("%s : 엣...? 미ㅋㅏ..ㅉ.. ", p1.getName());
		enter();
		System.out.print(" 눈 앞이 어두워진다.... ");
		enter3();
		System.out.print("...");
		enter2();
		System.out.printF("%s : 와타시 죽은걸까나? ", p1.getName());
		enter3();
		System.out.printf("??? : %s님 일어나세요 ");
		enter3();
		System.out.printf("%s : 누구지?", p1.getName());
		enter2();
		System.out.print("눈을 뜬다");
		enter2();
		System.out.printf("%s : 누..누구세요?", p1.getName());
		enter3();
		System.out.print("??? : 저는 당신을 이세계로 소환시킨 '시스템'입니다.");
		enter();
		System.out.printf("%s : ㅅ..시스템..? ", p1.getName());
		enter3();
		System.out.printf("%s : ㅇ...와타시를 소환시킨 이유가 무엇이죠? ", p1.getName());
		enter();
		System.out.print("%s : 이세계에서 영웅으로 선택받았기 때문입니다. ");
		enter();
		System.out.printf("%s : 그..그럼 뭘 하면 되죠?", p1.getName());
		enter3();
		System.out.print("시스템 : 일단 이세카이를 같이 모험할 동료를 선택해주세요.");
		enter();
		System.out.printf("%s : 동료를 선택하라고? ", p1.getName());
		enter3();
		System.out.print("이름 : 린 / ");
		System.out.print("이름 : 모모카 / ");
		System.out.print("이름 : 카야 ");
		enter();
		System.out.printf("이건! 내가 평소에 하는 '파란아카이브' 캐릭터들이잖아?", p1.getName());
		enter();
		System.out.printf("이세카이 나쁘지 않을지도?", p1.getName());
		enter();
		System.out.printf("%s : 누구를 선택하지?", p1.getName());
		enter3();
		
		while(true) {

			System.out.println("         1. 린         2. 모모카         3. 카야         ");
			enter();
			
			Game game = new Game();
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				Player p2 = new Player("나나가미 린");
				game.린(p2);
				break;
			case 2 :
				Player p3 = new Player("유라기 모모카");
				game.모모카(p3);
				break;
			case 3 :
				Player p4 = new Player("시라누이 카야");
				game.카야(p4);
				break;
			default :
				System.out.println("止まる");
			}
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
	
		static void enter3() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(2500);
	}

	
}
