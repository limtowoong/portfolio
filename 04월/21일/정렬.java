package ffff;

public class SelectSort_0421 {

	public static void main(String[] args) {
		
		int A[] = {18, 5, 21, 2, 7};				//난수 a에 18, 5, 21, 2, 7를 넣음
		int min = 0;						//min 선언 (최소값)
		int temp;						//temp 선언 (임시로 저장할 값)
		
		System.out.println("최초 배열의 상태");
		System.out.println("-------------------------------------------");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");					//최초 배열의 상태를 출력
		}
		System.out.println("");
		System.out.println("-------------------------------------------");
		
		for(int num=0; num<A.length; num++) {
			System.out.println("A["+num+"] 자리에 넣을 최소값을 찾습니다.");
			min = num;								//min에 num값을 넣음
			System.out.println("현재 min: "+min+", A[min]: "+A[min]);
			System.out.println("-------------------------------------------");
			
			for(int i=num; i<A.length; i++) {
				System.out.println("현재 i:"+i+", A[i]:"+A[i]+" A[min]:"+A[min]+" 비교");
				if(A[i]<A[min]) {
					min = i;
					System.out.println("min 갱신, 현재 min: "+min);
				}
			}
			// 제일 작은놈 맨 앞으로 보내기
			// A[num]과 A[min]번째 교환작업
			temp = A[num];
			A[num] = A[min];
			A[min] = temp;

			System.out.println("");
			System.out.println(num+"번째 배열의 상태");
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i]+" ");
			}
		}

		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("최초 배열의 상태");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
