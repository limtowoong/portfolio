package Exam;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void ExamPrint() {
		System.out.println(" 성적출력 @@@@@@");
		int kor, eng, math;
		
		for(int i=0; i<current; i++) {
			
			kor = exams[i].getKor();
			eng = exams[i].getEng();
			math = exams[i].getMath();
			
			int total = kor + eng + math;
			float avg = total/3.0f;
			
			System.out.printf("국어:%d \t", kor);
			System.out.printf("영어:%d \t", eng);
			System.out.printf("수학:%d \n", math);
			System.out.printf("합계:%d \t", total);
			System.out.printf("평균:%f \n", avg);
			System.out.println("@@@@@@@@@@@@@@@@@@@@");
		}		
	}	
	
	public void ExamAdd() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("@@@@@@ 성적입력");
		int kor, eng, math;
		
		do {
			System.out.printf("국어성적 : ");
			kor = sc.nextInt();
			
			if(kor<0 || kor>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(kor<0 || kor>100);
		// 컨트롤 + 알트 + ↓
		do {
			System.out.printf("영어성적 : ");
			eng = sc.nextInt();
			
			if(eng<0 || eng>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(eng<0 || eng>100);
		
		do {
			System.out.printf("수학성적 : ");
			math = sc.nextInt();
			
			if(math<0 || math>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(math<0 || math>100);
		
		Exam e = new Exam();

		e.setKor(kor);
		e.setEng(eng);
		e.setMath(math);
		
		
		if(exams.length == current) {
			// 1. 임시 temp 만들기
			Exam[] temp = new Exam[exams.length + 5];
			
			// 2. 값 옮기기
			for(int i=0; i<exams.length; i++) {
				temp[i] = exams[i];
			}
			// 3. exams가 temp를 먹게 하기
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










