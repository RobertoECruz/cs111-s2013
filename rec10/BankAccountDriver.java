public class BankAccountDriver{

	public static void main(String args[]){
		BankAccount a=new BankAccount("a","b",1,5);

		System.out.println(a.getAccountNum());
		System.out.println(a.getBalance());
		a.deposit(10.25);
		System.out.println(a);

	}

}
