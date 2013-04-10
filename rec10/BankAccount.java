public class BankAccount {

	private int accountNum;
	private String cName;
	private String cAddress;
	private double balance;
	private BankAccount[] subAccounts = new BankAccount[4];

	public BankAccount(String cName, String cAddress, int accountNum){
		this.cName=cName;
		this.cAddress=cAddress;
		this.accountNum=accountNum;
		this.balance=0;
	}

	public BankAccount(String cName, String cAddress, int accountNum, double balance){
		this.cName=cName;
		this.cAddress=cAddress;
		this.accountNum=accountNum;
		this.balance=balance;
	}

	public double getBalance(){
		return this.balance;
	}
	
	public int getAccountNum(){
		return this.accountNum;
	}

	public String getName(){
		return this.cName;
	}

	public String getAddress(){
		return this.cAddress;
	}

	public double withdraw(double amount){
		if (amount > this.balance || amount < 0){
			System.out.println("Cannot withdraw that amount");
		} else {
			this.balance-=amount;
		}
		return this.balance;
	}

	public double deposit(double amount){
		if (amount > 0)
			this.balance+=amount;
		else
			System.out.println("Cannot deposit that amount");
		return this.balance;
	}

	public void addSubAccount(BankAccount a){
		for (int i=0; i<this.subAccounts.length; i++){
			if (this.subAccounts[i] == null){
				this.subAccounts[i]=a;
				break;
			}
		}
	}

	public String toString(){
		return this.cName+": "+this.balance;
	}
}













