package ffff;

import java.util.Scanner;

public class NK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 자연수를 입력하세요.");
		int N = sc.nextInt();

		System.out.println("두번째 자연수를 입력하세요.");
		int K = sc.nextInt();
		
		int[] num = new int[N];
		int j=0;
		
		for(int i=1; i<=N; i++) {
			
			if(N % i==0) {
				num[j]=i;
				j++;
			}
		}
		
				if(num[K-1]<K) {
					System.out.println("-1");
				}
				else {
					System.out.println(N+"의 "+K+"번째 약수는"+num[K-1]);
				}

		
	}

}
