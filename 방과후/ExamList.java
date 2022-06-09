package Exam;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void ExamPrint() {
		System.out.println(" ������� @@@@@@");
		int kor, eng, math;
		
		for(int i=0; i<current; i++) {
			
			kor = exams[i].getKor();
			eng = exams[i].getEng();
			math = exams[i].getMath();
			
			int total = kor + eng + math;
			float avg = total/3.0f;
			
			System.out.printf("����:%d \t", kor);
			System.out.printf("����:%d \t", eng);
			System.out.printf("����:%d \n", math);
			System.out.printf("�հ�:%d \t", total);
			System.out.printf("���:%f \n", avg);
			System.out.println("@@@@@@@@@@@@@@@@@@@@");
		}		
	}	
	
	public void ExamAdd() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("@@@@@@ �����Է�");
		int kor, eng, math;
		
		do {
			System.out.printf("����� : ");
			kor = sc.nextInt();
			
			if(kor<0 || kor>100) {
				System.out.println("�ٽ���!(0~100)");
			}			
		}while(kor<0 || kor>100);
		// ��Ʈ�� + ��Ʈ + ��
		do {
			System.out.printf("����� : ");
			eng = sc.nextInt();
			
			if(eng<0 || eng>100) {
				System.out.println("�ٽ���!(0~100)");
			}			
		}while(eng<0 || eng>100);
		
		do {
			System.out.printf("���м��� : ");
			math = sc.nextInt();
			
			if(math<0 || math>100) {
				System.out.println("�ٽ���!(0~100)");
			}			
		}while(math<0 || math>100);
		
		Exam e = new Exam();

		e.setKor(kor);
		e.setEng(eng);
		e.setMath(math);
		
		
		if(exams.length == current) {
			// 1. �ӽ� temp �����
			Exam[] temp = new Exam[exams.length + 5];
			
			// 2. �� �ű��
			for(int i=0; i<exams.length; i++) {
				temp[i] = exams[i];
			}
			// 3. exams�� temp�� �԰� �ϱ�
			exams = temp;
		}
		
		exams[current] = e;
		current++;
	}


	
	public ExamList() {

		this(3);
	}

	public ExamList(int i) {
		exams = new Exam[i];
		current = 0;
	}
	
	
}










