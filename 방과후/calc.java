package calc;

import java.util.Scanner;
public class calc {
	public static void main(String[] args) {
		// �� ����, ������ �Է¹޾Ƽ� �ش� ����ϱ�		
		// 1. ���� �ΰ� �Է¹ޱ�
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		int result;
		boolean loop = true;
		
		while(loop) {
			System.out.print("num1?: ");
			num1 = sc.nextInt();
			// ��Ʈ�� + ��Ʈ + �Ʒ�����Ű
			System.out.print("num2?: ");
			num2 = sc.nextInt();
			
			// 2. ��Ģ�����߿� ������ �Է¹ޱ�
			System.out.print("���ϱ�(1),����(2),���ϱ�(3),������(4),����(5):");
			int op = sc.nextInt();
			
			switch(op) {  // 3. �����ڿ� ���� ��� ����
			case 1 :
				add(num1, num2);
				break;
			case 2 :
				sub(num1, num2);
				break;
			case 3 :
				result = multi(num1, num2);
				System.out.printf("%d * %d = %d \n", num1, num2, result);
				break;
			case 4 :
				result = num1/num2;
				System.out.printf("%d / %d = %d \n", num1, num2, result);
				break;
			case 5 :
				loop = false;
				System.out.println("�� ������~");
				break;
			default :
				System.out.println("�� �ƴϾ�~");
			}		
		}
	}

	
	private static int multi(int num1, int num2) {		
		return num1*num2;
	}


	private static void sub(int num1, int num2) {
		System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);		
	}
	static void add(int a, int b) {
		System.out.printf("%d + %d = %d \n", a, b, a+b);
	}
	
	
	
	
}