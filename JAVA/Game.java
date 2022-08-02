package newprj;

import java.util.Scanner;

public class Game {

	int life = 3;
	
	public void 린(Player p2) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player();
		
		System.out.print("시스템 : 나나가미 린 소환 ");
		enter2();
		System.out.print(" 린을 쳐다본다. ");
		enter1_5();
		System.out.printf("%s : ( 칙쇼! 카와이한 미소녀짱인 줄 알았는데 코와이다네 린짜~응 )", p1.getName());
		enter3();
		System.out.printf("%s : 저 린짜ㅇ이 아니라 린사마 ㄷ..당신이 제 도모다찌냐능?", p1.getName());
		enter3();
		System.out.printf("%s : 뭐야 이 오타쿠는?", p2.getName());
		enter2();
		System.out.printf("%s : 이런 육수새끼가 내 동료라고?", p2.getName());
		enter2_5();
		System.out.print(" '나나가미 린'님께서 당신을 죽였습니다. ");
		enter2_5();
		
		life --;
		System.out.print(" 목숨이 깎여 " + life + "개의 목숨 남았습니다. ");
		enter2();
	}
		
	public void 모모카(Player p3) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
			
		Player p1 = new Player();
			
		System.out.print("시스템 : 유라기 모모카 소환 ");
		enter2();
		System.out.printf("%s : (후욱후욱) 너무 카와이 한거아니냐능? ", p1.getName());
		enter2_5();
		System.out.printf("%s : 윽 역겨워 ", p3.getName());
		enter1_5();
		System.out.printf("%s : 크윽.. 어떻게 그런말을 할 수가 있냐능.. ", p1.getName());
		enter2_5();
		System.out.printf("%s : 이런 돼지새끼랑 동료를 하라고?  ", p3.getName());
		enter2();
		System.out.printf("%s : 나..나는 돼지가 아니라능!", p1.getName());
		enter2();
		System.out.printf("%s : 오늘 아침에 국밥 5그릇밖에 안 먹었다능..", p1.getName());
		enter2_5();
		System.out.printf("%s : ... ", p3.getName());
		enter1_5();
		System.out.printf("%s : 나랑 동료 할 맘 있는 거지? ", p3.getName());
		enter2();
		System.out.printf("%s : 당연하다능! ", p1.getName());
		enter1_5();
		System.out.printf("%s : 그럼... 내 조건은..", p3.getName());
		enter2();
		System.out.printf("%s : 애니금지 국밥금지 오타쿠말투금지 어때? ", p3.getName());
		enter3();
		System.out.printf("%s : 손나 바카나 와타시의 인생에 전부를 가져가다니 다메다요 이라능!", p1.getName());
		enter3();
		System.out.printf("%s : 우욱... 꺼져", p3.getName());
		enter1_5();
		System.out.print(" 동료가 떠났습니다. ");
		enter2();
	
		life --;
		System.out.print(" 목숨이 깎여 " + life + "개의 목숨 남았습니다. ");
		enter2();
	}
	
	public void 카야(Player p4) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
				
		Player p1 = new Player();
			
		System.out.print("시스템 : 시라누이 카야 소환 ");
		enter2();
		System.out.printf("%s : 안녕하세ㅇ... 까약 (찰싹)", p4.getName());
		enter2();
		System.out.print(" 뺨을 맞았다 ");
		enter1_5();
		System.out.printf("%s : ( 기분이 좋다.. 혹시 나 이런취향? ) ", p1.getName());
		enter2_5();
		System.out.printf("%s : 카야짱 더 때려주라능! 허헣 ", p1.getName());
		enter2();
		System.out.printf("%s : 윽... ", p4.getName());
		enter1_5();
		System.out.printf("%s : 경멸하는 카야짱도 카와이 하다능 (후욱후욱) ", p1.getName());
		enter3();
		System.out.printf("%s : 하야쿠! 카야짱 ", p1.getName());
		enter1_5();
		System.out.printf("%s : 와타시를 더 때려달라능! ", p1.getName());
		enter2();
		System.out.printf("%s : ^^;; ", p4.getName());
		enter1_5();
		System.out.print("%s : ( 쓰윽 ) ", p4.getName());
		enter1_5();
		System.out.printf("%s : 카야짱 그건 뭐냐능...? ", p1.getName());
		enter2();
		System.out.printf("%s : ( 씨익 ) ", p4.getName());
		enter1_5();
		System.out.printf("%s : 히익?! ㄱ...그건 오함마 아니냐능? ", p1.getName());
		enter2();
		System.out.printf("%s : 조또마떼! 카야짱 ", p1.getName());
		enter2();
		System.out.printf("%s : 다메요!!!!!!! ", p1.getName());
		enter2();
		
		life --;
		System.out.print(" 목숨이 깎여 " + life + "개의 목숨 남았습니다. ");
		enter2();
	}
	
	static void end() throws InterruptedException {
		Thread.sleep(500);
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
				 
	if ( life == 0 ) {
		System.out.print(" 목숨을 모두 소진하였습니다.");	
		System.out.print(" Game Over.");
		enter2();
		System.out.print("			    The End			");
		end();
		System.out.print("							");
		end();
		System.out.print("			오타쿠	민경석		   ");
		end();
		System.out.print("		   	  씹덕	 민경석		    ");
		end();
		System.out.print("			파오후	민경석		   ");
		end();
		System.out.print("		  	  돼지	 민경석		    ");
		end();
		System.out.print("		     자칭_존잘     민경석		  ");
		end();




	}
}
