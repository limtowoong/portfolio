package Day04;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("������","����");
	
		System.out.println("��: "+myPhone.model);
		System.out.println("����: "+myPhone.color);
		
		System.out.println("�������̻���: "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ��� ���� OOO �Դϴ�.");
		myPhone.sendVoice("�� �ݰ����ϴ�");
		myPhone.handup();
		
		myPhone.setwifi(true);
		myPhone.internet();
	}
	
	
}
