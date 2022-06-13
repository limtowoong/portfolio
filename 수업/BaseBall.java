package star;

import java.util.Random;
import java.util.Scanner;

public class Me {

	public static void main(String[] args) {

		int num[] = new int[3];
		int answer[] = new int[3];
		Random r = new Random();

		while(true) {
			for(int i=0; i<num.length; i++) {
				num[i] = r.nextInt(9)+1;
			}
			if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
			break;
			}
		}
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		 while(true) {
			 int strike = 0;
			 int ball = 0;
			 
			 System.out.print("숫자 3개를 입력해주세요");
			 for(int i=0; i<3; i++) {
				 answer[i] = sc.nextInt();
			 }
			 count++;
			 
			 for(int i=0; i<answer.length; i++) {
				 if(num[i]==answer[i]) {
					 strike++;
				 }
			 }
			 
			 for(int i=0; i<answer.length; i++) {
				 for(int j=0; j<answer.length; j++) {
					 if(!(i==j)) {
						 if(num[i]==answer[j]) {
							 ball++;
						 } 
					 }
				 }
			 }
			 System.out.println(strike+" 스트라이크! "+ball+" 볼!");
			 
			 if(strike==3) {
		            if (count <= 2) {
		                System.out.println("참 잘했어요!");
		            } else if (count <= 5) {
		                System.out.println("잘했어요!");
		            } else if (count <= 9) {
		                System.out.println("보통이네요!");
		            } else {
		                System.out.println("분발하세요!");
		            }
				 break;
			 }
		 }
	}
}
