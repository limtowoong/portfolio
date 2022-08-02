package newprj;
import java.util.Scanner;

public class Prj {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player();
		
		enter1_5();
		System.out.printf("%s : 오늘도 힘들었다능 후후", p1.getName());
		enter2();
		System.out.printf("%s : 집가서 미연시 해야겠다능!", p1.getName());
		enter2_5();
		System.out.print(" 땀을 흘리며 집에 들어간다 ");
		enter2();
		System.out.printf("%s : ( 게임을 키며 ) 미카짱 오늘도 많이 기다렸냐능?", p1.getName());
		enter3();
		System.out.printf("미카 : 왜이렇게 늦었어 %s쿤!" ,p1.getName());
		enter2();
		System.out.printf("%s : 고..고맨 미카짱", p1.getName());
		enter2();
		System.out.printf("%s : ㅇ..와타시 학교 때문에 느..늦어버렸다능", p1.getName());
		enter3();
		System.out.printf("미카 : 괜찮아 %s쿤!" , p1.getName());
		enter1_5();
		System.out.printf("미카 : %s쿤 오늘은 어디갈까?" , p1.getName());
		enter2();
		System.out.printf("%s : 어... ", p1.getName());
		enter1_5();
		System.out.printf("%s : 국밥집 어떠냐능? ", p1.getName());
		enter2();
		System.out.print("미카 : 좋아! ");
		enter1_5();
		System.out.print("시스템 : 국밥집으로 이동하시겠습니까?");
		enter2();
		System.out.print("확인을 누른다.");
		enter1_5();
		System.out.printf("%s : 미카짱 도착했다능! ", p1.getName());
		enter2();
		System.out.print("미카 : ... ");
		enter1_5();
		System.out.printf("%s : 미카짱 표정이 왜 그러냐능? ", p1.getName());
		enter2_5();
		System.out.printf("미카 : 고맨.. %s쿤.. ", p1.getName());
		enter2();
		System.out.print("( 푸슉 )");
		enter1_5();
		System.out.printf("%s : 엣?! ", p1.getName());
		enter1_5();
		System.out.printf("%s : 미ㅋㅏ..ㅉ.. ", p1.getName());
		enter1_5();
		System.out.print(" 눈 앞이 어두워진다 ");
		enter2();
		System.out.print("...");
		enter2();
		System.out.printf("%s : ( 와타시 죽은걸까나...? ) ", p1.getName());
		enter2();
		System.out.printf("??? : 야 일어나 육수련 ");
		enter2();
		System.out.printf("%s : ( ??? ) ", p1.getName());
		enter1_5();
		System.out.print(" 눈을 뜬다 ");
		enter1_5();
		System.out.printf("%s : 누..누구냐능!", p1.getName());
		enter2();
		System.out.print("??? : 나?");
		enter1_5();
		System.out.print("??? : 나는 '시스템'");
		enter2();
		System.out.printf("%s : ㅅ..시스템? ", p1.getName());
		enter1_5();
		System.out.printf("%s : ㄱ..그럼 ", p1.getName());
		enter1_5();
		System.out.printf("%s : 여..여기가 어디냐능? ", p1.getName());
		enter2_5();
		System.out.print("시스템 : 여긴 이세계고 넌 용사 ");
		enter2_5();
		System.out.printf("%s : 와..와타시가 요ㅇ..용사?!  ", p1.getName());
		enter1_5();
		System.out.printf("%s : 그..그럼 초미소녀 도모다찌도 있는거냐능?  ", p1.getName());
		enter1_5();
		System.out.print("시스템 : ㅇㅇ");
		enter1_5();
		System.out.printf("%s : 어떻게 소환 하냐능? ", p1.getName());
		enter3();
		System.out.print("시스템 : 대충해");
		enter1_5();
		System.out.printf("%s : 그..그럼 ", p1.getName());
		enter1_5();
		System.out.printf("%s : 초미소녀 도모다찌 소환!!! ", p1.getName());
		enter2();
		System.out.print(" 이름 : 린 / 이름 : 모모카 / 이름 : 카야 ");
		enter2_5();
		System.out.printf("ㅇ..이건! '파란아카이브' 캐릭터들이다능!", p1.getName());
		enter2_5();
		System.out.printf(" ( 이세카이 나쁘지 않을지도? )", p1.getName());
		enter2();
		System.out.printf("%s : 누구를 데려갈지 모르겠다능!! ", p1.getName());
		enter2();
		
		while(true) {

			System.out.println("         1. 린         2. 모모카         3. 카야         ");
			enter3();
			
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
				System.out.printf("%s : 소코마데다 " , p1.getName());
			}
		}
		
	}	




	static void enter1_5() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(1500);
	}
	
	static void enter2() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(2000);
	}
	
	static void enter2_5() throws InterruptedException {
		for(int i=0; i<6; i++) {
			System.out.println();
		}
		Thread.sleep(2500);
	}
		
	static void enter3() throws InterruptedException {
			for(int i=0; i<6; i++) {
				System.out.println();
		}
		Thread.sleep(3000);
	}

	
}
