package Exam;
import java.util.Scanner;

public class ExamAverage {
	public static void main(String[] args) {

		ExamList list = new ExamList();
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			menu = mainMenu();
			
			switch(menu) {
				case 1 :
					list.ExamAdd();
					break;
				case 2 :
					list.ExamPrint();
					break;
				case 3 :
					System.out.println("잘가~");
					keepLoop = false;
					break;
				default :
					System.out.println("장난치나!");
			}			
		}
	}
	
	private static int mainMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**메인메뉴**");
		System.out.print("입력(1)  출력(2)  종료(3)");
		
		return sc.nextInt();
	}
}
