package gogogogo;
import java.util.Scanner;

public class Starcraft {

	public static void main(String[] args) {
		
		Marine marine = new Marine("���̳�", 100);
		Medic medic = new Medic("����", 100);
		Medic medic2 = new Medic();
		
	/*	marine.name = "���̳�";
		marine.hp = 100;
		
		medic.name = "����";
		medic.mp = 100; 	*/
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			if(marine.hp<=0) {
				System.out.printf("< %s >�� �׾����ϴ�. ��! \n", marine.name);
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
			System.out.println("������ �����մϴ�.");
			break;
		default :
			System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

	private static void heal(Marine marine, Medic medic) {
		
		if(medic.mp>15) {
			medic.mp = medic.mp - 15;
			marine.hp = marine.hp + 20;
			
			if(marine.hp>100)
				marine.hp = 100;
			
			System.err.printf("< %s >�� ġ�Ḧ �����մϴ� \n", medic.name);
			System.out.printf("������ %d ���ҽ��ϴ� \n", medic.mp);
			System.out.printf("< %s >�� ġ��޾� HP�� %d �Ǿ����ϴ�. \n", marine.name, marine.hp);
		}else {
			System.out.printf("������ �����մϴ�(%d)\n",medic.mp);
		}
	}

	private static void stimpack(Marine marine) {
		 System.out.printf("< %s >�� �������� ����մϴ� '���' \n",   marine.name);
		 marine.hp = marine.hp - 10;
		 System.out.printf("���ݷ��� �����ϰ� HP�� %d ���ҽ��ϴ� \n", marine.hp);
	}

	private static int select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���(1), ġ�� (2), ������(3)");
		return sc.nextInt();
		
	}

}
