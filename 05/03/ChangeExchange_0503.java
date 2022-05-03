package ffff;

public class ChangeExchange_0503 {

	public static void main(String[] args) {

		int[] num = {18, 88, 7, 99, 3, 9999, 280, 1};
		
		for(int a=1; a<num.length; a++) {
			
			System.out.println(a+"¹øÂ°");
			
			for(int i=0; i<num.length-1; i++) {
				
				if(num[i] > num[i+1]) {
					
					int temp = num[i];
					num[i] = num[i+1];
					num[i=1] = temp;
			
					System.out.print("±³È¯ÀÛ¾÷ ");
					
					for(int j=0; j<num.length; j++) {
						
						System.out.print(num[i]+" ");
					}
					System.out.println("");
				}
			}
		}

		for(int j=0; j<num.length-1; j++) {
			System.out.print(num[j]+" ");
		}
	}

}
