package ffff;

import java.util.Scanner;

public class NK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 자연수를 입력하세요.");
		int N = sc.nextInt();		//N에 자연수 저장

		System.out.println("두번째 자연수를 입력하세요.");
		int K = sc.nextInt();		//K에 자연수 저장
		
		int[] num = new int[N];		//num 배열을 N번째까지 생성
		int j=0;		//j 생성
		
		for(int i=1; i<=N; i++) {	//i를 N번째까지 반복
			
			if(N % i==0) {		//N과 i에 나머지가 0이면 true
			//true
				num[j]=i;	//i를 num 배열 7번째에 넣음
				j++;		//j에 값을 1올림
			}
			//false
		}
		
			if(num[K-1]<K) {	//num 배열 (K-1)번째가 K 보다 작으면 true
				//true
				System.out.println("-1");	//-1 출력
			}
			else {
				//false
				System.out.println(N+"의 "+K+"번째 약수는"+num[K-1]);		//num 배열에 (K-1)번째 값을 출력
			}

		
	}

}
