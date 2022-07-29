package newprj;
import java.util.Scanner;

public class Prj {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player(player1);
		
		enter();
		System.out.printf("%s : 아 오늘도 힘들었다", p1.getName());
		enter();
		System.out.printf("%s : 집가서 게임(미연시) 해야지ㅎㅎ", p1.getName());
		enter();
		System.out.print("땀을 흘리며 집에 들어간다");
		enter();
		System.out.printf("%s : ( 게임를 키며 ) 미카짱 오늘도 많이 기다렸지?", p1.getName());
		enter();
		System.out.printf("미카 : 왜케 늦었서 %s쿤!" ,p1.getName());
		enter();
		System.out.printf("%s : 고..고맨 미카짱", p1.getName());
		enter();
		System.out.printf("%s : ㅇ..와타시 학교 때문에 느..늦어버렸다랄까나?", p1.getName());
		enter();
		System.out.printf("미카 : 괜찮아 %s쿤!" , p1.getName());
		enter();
		System.out.printf("%s쿤 우리 오늘 데이트 할래?" , p1.getName());
		enter();
		System.out.printf("%s : 으응 조..좋아! \n", p1.getName());
		enter();
		System.out.print("시스템 : 데이트를 하시겠습니까?");
		enter();
		System.out.print("확인을 누른다.");
		enter();
		System.out.print("확인을 누르자 모니터에서 빛이 뿜어져 나왔다.");
		enter();
		System.out.printf("%s : 엣? \n", p1.getName());
		enter();
		System.out.print("정신을 잃었다");
		enter();
		System.out.print("...");
		enter();
		System.out.print("아무것도 보이질 않는다.");
		enter();
		System.out.print("??? : 용사님 일어나세요!");
		enter();
		System.out.printf("%s : 누구지?", p1.getName());
		enter();
		System.out.print("눈을 뜬다");
		enter();
		System.out.printf("%s : 누..누구세요?", p1.getName());
		enter();
		System.out.print("??? : 용사님 이세계를 지켜주세요");
		enter();
		System.out.printf("%s : 가..갑자기 무슨 소리세요!!", p1.getName());
		enter();
		System.out.print("시스템 : 당신은 이세카이에 왔습니다.");
		enter();
		System.out.printf("%s : 어..? 환청인가..", p1.getName());
		enter();
		System.out.print("시스템 : 이세카이를 같이 모험할 동료를 선택해주세요.");
		enter();
		System.out.printf("%s : 동료를 선택하라고? ", p1.getName());
		enter();
		System.out.print("이름 : 린 / ");
		System.out.print("이름 : 모모카 / ");
		System.out.print("이름 : 카야 ");
		enter();
		System.out.printf("이 녀석들은 내가 평소에 하던 '파란아카이브'에서 나오던 녀석들이잖아?", p1.getName());
		enter();
		System.out.printf("이세카이 나쁘지 않을지도?", p1.getName());
		enter();
		System.out.printf("%s : 누굴선택할까?", p1.getName());
		enter();
		
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

	
}
