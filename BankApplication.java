package Day04;
import java.util.*;

public class BankApplication {
		
		private static Account[]  accountArr = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			
		boolean run = true;
			
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
				
			int selNo = Integer.parseInt(scanner.nextLine());

			if(selNo == 1) {
				createAccount();
			}else if(selNo == 2) {
				accountList();
			}else if(selNo == 3) {
				deposit();
			}else if(selNo == 4) {
				withdraw();
			}else if(selNo == 5) {
				run = false;
			}
		}
	}
		
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.println("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i] == null) {
				accountArr[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for(int i=0; i<accountArr.length; i++) {
			Account account = accountArr[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.print(" ");
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 완료되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌정보가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 완료되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i] != null) {
				String fano = accountArr[i].getAno();
				if(fano.equals(ano)) {
					account = accountArr[i];
					break;
				}
			}
		}
		
		return account;
	}
}
