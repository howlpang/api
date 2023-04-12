package sample11_bank;

import java.util.*;

public class BankingService {

	private BankingRepository repo = new BankingRepository(); // BankingRepository를 호출하기 위해서 만듦.
	
	// 신규계좌 개설하기 기능
	/* 사용자가 입력한 신규 계좌정보를 전달받아서 영속화계층을 저장시키고, 개설된 계좌정보를 반환한다.
	 * 반환타입 : Account
	 * 메소드명 : createAccount
	 * 매개변수 : Account account
	 * 
	 */
	public Account createAccount(Account account) {
		// 전달받은 계좌정보에 계좌상태, 개설일시를 저장한다.
		account.setStatus("사용중");
		account.setCreatedDate(new Date());
		
		//영속화 계층에 계좌정보를 전달해서 저장시킨다.
		repo.insertAccount(account);
		
		return account;
	}
	
	//전계좌 조회하기
	/*
	 * 예금주명을 전달받아서 해당 예금주명을 개설된 모든 계좌정보를 조회해서 반환한다.
	 * 반환타입 : List<Account>
	 * 메소드명 : getMyAllAccounts
	 * 매개변수 : String name
	 */
	public List<Account> getMyAllAccounts(String name) {
		
		List<Account> accounts =repo.getAccountByName(name);
		return accounts;
	}
	//계좌상세정보 조회하기
	/*
	 * 계좌번호와 비밀번호를 전달받아서 계좌상세정보를 반환한다.
	 * 반환타입 : Account
	 * 메소드명 : getAccountDetail
	 * 매개변수 : int accNo, int pwd
	 */
	public Account getAccountDetail(int accNo, int pwd) {
		Account account =repo.getAccountByNo(accNo);
		if(account == null) {		// 계좌번호가 없을 경우 null값 변환
			return null;
		}
		if(account.getPassword() != pwd) {			// 비밀번호가 일치하지 않을경우 null값 반환
			return null;
		}
		
		return account;
	}
	
	//입금하기
	/*
	 * 계좌번호와 입금액을 전달받아서 현재 잔액을 증가시킨다.
	 * 반환타입 : boolean
	 * 메소드명 : deposit
	 * 매개변수 : int accNo, long amount
	 */
	// BankService  
		//	계좌번호를 전달해서 BankRepository의 getAccountByNo(no)를 실행해서 계좌정보를 조회한다.
		//	계좌정보가 존재하지 않으면 false값을 반환한다. 계좌정보가 존재하면 현재 계좌정보의 잔액을 입금액만큼 증가시킨다.
		//	true값을 반환한다.
	public boolean deposit(int accNo, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return false;
		}
		long balance = account.getBalance() + amount;
		account.setBalance(balance);
		
		return true;
	}
	
	//출금하기
//	BankService 계좌번호를 전달해서 BankRepository.getAccountByNo(no)를 실행해서 계좌정보를 조회한다.
	//		계좌정보가 존재하지 않으면 false값을 반환한다.  
	//		조회된 계좌정보의 비밀번호와 매개변수를 전달받은 비밀번호가 서로 일치하지 않으면 false로 반환한다.
	// 		조회된 계좌정보의 잔액과 매개변수로 전달받은 출금액을 비교했을 때 현재 잔액이 출금액보다 작으면 false를 반환한다.
	//		현재 계좌정보의 잔액을 입금액만큼 감소시킨다. true값을 반환한다.
	public boolean withdraw(int accNo, int pwd , long amount) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return false;
		}if(pwd !=account.getPassword()) {
			return false;
			
		}if(account.getBalance()<amount) {
			return false;
			
		}
		long balance = account.getBalance() - amount;
		account.setBalance(balance);
		
		return true;
	}
//	//계좌번호를 전달해서 BankRepository.getAccountByNo(no)를 실행시켜 계좌정보를 조회한다.
//	 *  	계좌정보가 null이면 false를 반환한다.
//	 *  	계좌정보의 비밀번호와 이전 비밀번호가 일치하지 않으면 false를 반환한다.
//	 *  	계좌정보의 비밀번호를 전달받은 비밀번호를 변경한다.
//	 *  	true값을 반환한다.
	//비밀번호 변경하기
	public boolean changePassword(int accNo, int prePassword ,int pwd) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return false;
		}if(account.getPassword() != prePassword) {
			return false;
		}
		account.setPassword(pwd);
		return true;
		
	}
	
	/* 계좌해지정보를 저장할 Map<String, Object> 객체를 생성한다.
	 * 전달받은 계좌번호로 BankRepository의 getAccountByNo(no)를 실행해서 계좌정보를 조회한다.
	 * 계좌정보가 null이면 Map객체에 "success", "false"를 저장하고, map객체를 반환한다.
	 * 비밀번호가 일치하지 않으면 Map객체에 "success", "false"를 저장하고, map객체를 반환한다.
	 * Map객체에 아래의 정보를 저장한다.
	 * "success",true를 저장한다.
	 *  "no" , 계좌번호를 저장한다.
	 *  "owner" , 예금주를 저장한다.
	 *  "balance" , 현재잔액을 저장한다.
	 *  "interest" , 금리를 저장한다.
	 *  "amount" , 해지예상금액을 계산해서 저장한다.
	 *  BankRepository의 deleteAccount(no)를 실행해서 계좌정보를 삭제한다.
	 * Map 객체를 반환한다.
	 * 
	 */
	
	//해지하기
	public Map<String, Object> expireAccount(int accNo, int password){
		
		Map<String, Object> result = new HashMap<>();
		
		Account account = repo.getAccountByNo(accNo);
		if(account ==null) {
			result.put("success", false);
			return result;
		}
		if(account.getPassword() != password) {
			result.put("success", false);
			return result;
		}
		int interest = (int) (account.getBalance()*account.getInterestRate()*5);  
		result.put("success", true);
		result.put("no", account.getNo());
		result.put("owner", account.getOwner());
		result.put("balance",account.getBalance());
		result.put("interest", interest); // 이자
		result.put("amount", account.getBalance()+interest);
		
		
		repo.deleteAccount(accNo);
		
		return result;
	}
	
	
}

