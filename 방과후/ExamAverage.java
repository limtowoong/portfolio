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
					System.out.println("�߰�~");
					keepLoop = false;
					break;
				default :
					System.out.println("�峭ġ��!");
			}			
		}
	}
	
	private static int mainMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**���θ޴�**");
		System.out.print("�Է�(1)  ���(2)  ����(3)");
		
		return sc.nextInt();
	}
}
