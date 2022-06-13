## 순서

  #### ① import문

	import java.util.Random;
	import java.util.Scanner;

  #### ② 배열 생성

	int num[] = new int[3];
	int answer[] = new int[3];
	Random r = new Random();
  
  #### ③ 배열에 난수 생성

	while(true) {
	for(int i=0; i<num.length; i++) {
			num[i] = r.nextInt(9)+1;
		}
		if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
		break;
		}
	}
    
 #### ④ 

