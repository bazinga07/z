

package assign3;

enum Account {IDLE,OPENING, SUSPENDED, DEPOSITED, SHOW_BALANCE, WITHDRAWN, CLOSED}

public class Transaction{	
	int balance, accnt;
	Account account = Account.IDLE;
	
	public Transaction(int balance, int accnt){
		this.balance = balance;
		this.accnt = accnt;
	}
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public int getAccnt(){
		return accnt;
	}
	public void setAccnt(int accnt){
		this.accnt = accnt;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	public Account getAccount(){
		return this.account;
	}
	public void open_account(){
		if(this.getAccount().equals(Account.IDLE)){
			if(this.balance >= 500){
				System.out.println("Account "+ accnt+"opening");
				setAccount(Account.OPENING);
			}
			else{
				System.out.println("Sorry Account can't be openend");
			}
		}
		else{
			System.out.println("Account is in IDLE State");
		}
	}
	public void deposit(int depo){
		if(this.getAccount().equals(Account.OPENING)){
			if(depo >= 100){
				System.out.println("Amount of Rs. "+depo+"  deposited successfully");
				balance = balance + depo;
				showBalance();
				setAccount(Account.DEPOSITED);
			}
			else{
				System.out.println("Amount is less than 100. Hence can not be deposited");
			}
		}
		else{
			System.out.println("No amount available for depositing");
		}
	}
	public void withdraw(int amnt){
		if(this.getAccount().equals(Account.OPENING) || this.getAccount().equals(Account.DEPOSITED) || this.getAccount().equals(Account.SHOW_BALANCE)){
			if(this.balance >= 500){
				System.out.println("Amount of Rs." + amnt +" is withdrawn");
				balance = balance - amnt;
				showBalance();
			}
		}
		else{
				System.out.println("Else condition");
		}
	}
	public void showBalance(){
		if(this.getAccount().equals(Account.OPENING) || this.getAccount().equals(Account.DEPOSITED) || this.getAccount().equals(Account.WITHDRAWN)){
			System.out.println("The currentbalance is: Rs."+ this.balance);
			setAccount(Account.SHOW_BALANCE);
		}
		else{
			System.out.println("The system is in IDLE state");
		}
	}
	public void suspended(){
		if(this.getAccount().equals(Account.OPENING) || this.getAccount().equals(Account.SHOW_BALANCE)){
			System.out.println("Suspended");
			setAccount(Account.SUSPENDED);
		}
	}	
	public void closed(){
		if(this.getAccount().equals(Account.WITHDRAWN)|| this.getAccount().equals(Account.SHOW_BALANCE) || this.getAccount().equals(Account.CLOSED)){
			System.out.println("Suspended");
			setAccount(Account.SUSPENDED);
		}
	}
}

















