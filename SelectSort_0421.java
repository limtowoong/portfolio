package ffff;

public class SelectSort_0421 {

	public static void main(String[] args) {
		
		//	int[] A = new int[5];
		int A[] = {18, 5, 21, 2, 7};
		int min = 0;
		int temp;
		
		System.out.println("���� �迭�� ����");
		System.out.println("-------------------------------------------");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		System.out.println("-------------------------------------------");
		
		for(int num=0; num<A.length; num++) {
			System.out.println("A["+num+"] �ڸ��� ���� �ּҰ��� ã���ϴ�.");
			min = num;
			System.out.println("���� min: "+min+", A[min]: "+A[min]);
			System.out.println("-------------------------------------------");
			
			for(int i=num; i<A.length; i++) {
				System.out.println("���� i:"+i+", A[i]:"+A[i]+" A[min]:"+A[min]+" ��");
				if(A[i]<A[min]) {
					min = i;
					System.out.println("min ����, ���� min: "+min);
				}
			}
			// ���� ������ �� ������ ������
			// A[num]�� A[min]��° ��ȯ�۾�
			temp = A[num];
			A[num] = A[min];
			A[min] = temp;

			System.out.println("");
			System.out.println(num+"��° �迭�� ����");
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i]+" ");
			}
		}

		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("���� �迭�� ����");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}