package sungil;

import java.util.Scanner;

class People{
	private String name;
	private int KorG;
	private int EngG;
	private int MathG;
	private int SumG;
	private double AvgG;
	private int RankG;

	void setName(String name) {
		this.name = name;
	}
	void setKorG(int kor) {
		this.KorG = kor;
	}
	void setEngG(int eng) {
		this.EngG = eng;
	}
	void setMathG(int math) {
		this.MathG = math;
	}
	void setRankG(int rank) {
		RankG = rank;
	}
	 String getName() {
		return this.name;
	}
	 int getKor() {
		return this.KorG;
	}
	 int getEng() {
		return this.EngG;
	}
	 int getMath() {
		return this.MathG;
	}
	 int getSum() {
		return this.getKor() + this.getEng() + this.getMath();
	}
	 double getAvg() {
		return this.getSum()/3;
	}
	 int getRank() {
		return this.RankG;
	}
	 void printScore() {
		 System.out.printf(" %3s %3d %3d %3d %3d %3.2f %3d \n", this.getName(), this.getKor(), this.getEng(), this.getMath(), this.getSum(), this.getAvg(), this.getRank());
	 }
}

public class GradeP {
	public static void Main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇명의 성적처리를 하나요(숫자입력)? ");
		int num = input.nextInt();
		
		People stu[] = new People[num];
		
		for(int i=0; i<stu.length; i++) {
			stu[i] = new People();
		}
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("성명을 입력하세요: ");
			stu[i].setName(input.next());
			System.out.println("국어 점수를 입력하세요: ");
			stu[i].setKorG(input.nextInt());
			System.out.println("영어 점수를 입력하세요: ");
			stu[i].setEngG(input.nextInt());
			System.out.println("수학 점수를 입력하세요: ");
			stu[i].setMathG(input.nextInt());
		}
		
		for(int i=0; i<stu.length; i++) {
			int rank=1;
			for(int j=0; j<stu.length; j++) {
				if (stu[i].getSum() < stu[j].getSum()) rank++;
			}
			stu[i].setRankG(rank);
		}
		
		System.out.println("===========================================");
		System.out.printf("%3s %3s %2s %2s %3s %3s %4s \n", "성명","국어","영어","수학","합계","평균","석차");
		for(int i=0; i<stu.length; i++) {
			stu[i].printScore();
		}
	}
}