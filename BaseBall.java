package star;

import java.util.Random;
import java.util.Scanner;

public class Me {

public static void main(String[] args) {

	int num[] = new int[3];
	int ans[] = new int[3];
	Random r = new Random();

	while(true) {
		for(int i=0; i<num.length; i++) {
			num[i] = r.nextInt(9)+1;
		}
		if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
		break;
		}
	}
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
	while(true) {
		int strike = 0;
		int ball = 0;
		
		do {
		
		System.out.print("1번째 :");
			ans[0] = sc.nextInt();
		System.out.print("2번째 :");
			ans[1] = sc.nextInt();
		System.out.print("3번째 :");
			ans[2] = sc.nextInt();
			
			if(ans[0]==0||ans[1]==0||ans[2]==0) {
				System.out.println("0보다 높은 숫자를 입력해주세요");
			}else if(ans[0]>9||ans[1]>9||ans[2]>9) {
				System.out.println("9이하에 숫자를 입력해주세요");
			}else if(ans[0]==ans[1]||ans[1]==ans[2]||ans[0]==ans[2]) {
				System.out.println("중복값은 입력할 수 없습니다.");
			}
			
			}while((ans[0]==0)||(ans[1]==0)||(ans[2]==0)||
	              (ans[0]>9)||(ans[1]>9)||(ans[2]>9)||
	              (ans[0]==ans[1])||(ans[1]==ans[2])||(ans[0]==ans[2]));
		 
		for(int i=0; i<ans.length; i++) {
			if(num[i]==ans[i]) {
				strike++;
			}
		}
			
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<ans.length; j++) {
					if(num[i]==ans[j] && !(i==j)) {
						ball++;
					} 
			}
		}
			 System.out.println(strike+" 스트라이크! "+ball+" 볼!");
			 
		if(strike==3) {
				
			if (cnt <= 2) {
			System.out.println("참 잘했어요!");
			} else if (cnt <= 5) {
					
			System.out.println("잘했어요!");
			} else if (cnt <= 9) {
					
			System.out.println("보통이네요!");
			} else {
					
			System.out.println("분발하세요!");
			}
			break;
		 }
	 }
}
}
