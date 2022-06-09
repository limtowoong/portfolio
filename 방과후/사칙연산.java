package calc;

import java.util.Scanner;
public class calc {
	public static void main(String[] args) {
		// 두 숫자, 연산자 입력받아서 해당 계산하기		
		// 1. 숫자 두개 입력받기
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		int result;
		boolean loop = true;
		
		while(loop) {
			System.out.print("num1?: ");
			num1 = sc.nextInt();
			// 컨트롤 + 알트 + 아래방향키
			System.out.print("num2?: ");
			num2 = sc.nextInt();
			
			// 2. 사칙연산중에 뭐할지 입력받기
			System.out.print("더하기(1),빼기(2),곱하기(3),나누기(4),종료(5):");
			int op = sc.nextInt();
			
			switch(op) {  // 3. 연산자에 따른 계산 때려
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
				System.out.println("응 가세요~");
				break;
			default :
				System.out.println("응 아니야~");
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
