package Day04;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
	
		System.out.println("모델: "+myPhone.model);
		System.out.println("생삭: "+myPhone.color);
		
		System.out.println("와이파이상태: "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요 저는 OOO 입니다.");
		myPhone.sendVoice("네 반갑습니다");
		myPhone.handup();
		
		myPhone.setwifi(true);
		myPhone.internet();
	}
	
	
}
