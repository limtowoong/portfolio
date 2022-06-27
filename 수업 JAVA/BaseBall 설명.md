	int x,y,z;
	Random r = new Random();
	x=Math.abs(r.nextInt()%9)+1;
	
	do {
		y=Math.abs(r.nextInt()%9)+1;
	}while(y==x);
		
	do {
		z=Math.abs(r.nextInt()%9)+1;
	}while((z==x)||(z==y));
   
&nbsp; x, y, z에 난수값 넣기 (중복 제거)

	System.out.println("첫 번째 :");
	user = in.readLine();
	usr[0]= new Integer(user).intValue();
					
	System.out.println("두 번째 :");
	user = in.readLine();
	usr[1]= new Integer(user).intValue();
					
	System.out.println("세 번째 :");
	user = in.readLine();
	usr[2]= new Integer(user).intValue();
  
&nbsp; 입력값을 받고 그 값을 int형으로 변환 후 usr 배열에 저장

	if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)) {
		System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
	}else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)) {
		System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
	}else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])) {
		System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
	}
		}while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||
			(usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
			(usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));
      
&nbsp; usr 배열에 값들 중에 중복값이 나오거나 0 또는 10이상 나오면 다시 입력

	if(usr[0]==com[0]) strike++;
	if(usr[1]==com[1]) strike++;
	if(usr[2]==com[2]) strike++;
				
	if(usr[0]==com[1]) ball++;
	if(usr[0]==com[2]) ball++;
	if(usr[1]==com[0]) ball++;
	if(usr[1]==com[2]) ball++;
	if(usr[2]==com[0]) ball++;
	if(usr[2]==com[1]) ball++;
            
&nbsp; 조건에 따라 strike값과 ball값을 높임 

	if(result<=2){
	System.out.println("참 잘했어요!"); //시도횟수가 2번 이하
	} else if(result<=5){
	System.out.println("잘했어요!");//시도횟수가 3번부터 5번 이하
	} else if(result<=9){
	System.out.println("보통이네요!"); //시도횟수가 6번~9번
	} else{
	System.out.println("분발하세요!");// 시도횟수가 10번
	}
  
&nbsp; 시도 횟수에 따라 바뀌는 값
