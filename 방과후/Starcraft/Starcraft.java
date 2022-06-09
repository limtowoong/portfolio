package gogogogo;
import java.util.Scanner;

public class Starcraft {

	public static void main(String[] args) {
		
		Marine marine = new Marine("레이너", 100);
		Medic medic = new Medic("유미", 100);
		Medic medic2 = new Medic();
		
	/*	marine.name = "레이너";
		marine.hp = 100;
		
		medic.name = "유미";
		medic.mp = 100; 	*/
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			if(marine.hp<=0) {
				System.out.printf("< %s >가 죽었습니다. 끝! \n", marine.name);
				break;
			}
		menu = select();
		switch(menu) {
		case 1 :
			stimpack(marine);
			break;
		case 2 :
			heal(marine, medic);
			break;
		case 3 :
			System.out.println("게임을 종료합니다.");
			break;
		default :
			System.out.println("다시 입력하세요.");
			}
		}

	}

	private static void heal(Marine marine, Medic medic) {
		
		if(medic.mp>15) {
			medic.mp = medic.mp - 15;
			marine.hp = marine.hp + 20;
			
			if(marine.hp>100)
				marine.hp = 100;
			
			System.err.printf("< %s >로 치료를 시작합니다 \n", medic.name);
			System.out.printf("마나가 %d 남았습니다 \n", medic.mp);
			System.out.printf("< %s >가 치료받아 HP가 %d 되었습니다. \n", marine.name, marine.hp);
		}else {
			System.out.printf("마나가 부족합니다(%d)\n",medic.mp);
		}
	}

	private static void stimpack(Marine marine) {
		 System.out.printf("< %s >가 스팀팩을 사용합니다 '사용' \n",   marine.name);
		 marine.hp = marine.hp - 10;
		 System.out.printf("공격력이 증가하고 HP가 %d 남았습니다 \n", marine.hp);
	}

	private static int select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("스팀팩 사용(1), 치료 (2), 끝내기(3)");
		return sc.nextInt();
		
	}

}
