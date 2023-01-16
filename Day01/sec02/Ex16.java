package Day01.sec02;

public class Ex16 {

	public static void main(String[] args) {
		
		int value = 4342;

		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14 * 10 * 10; 
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
	}	
}
