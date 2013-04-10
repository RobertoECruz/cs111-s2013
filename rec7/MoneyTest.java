public class MoneyTest {

	public static void main(String args[]) {
		Money myself = new Money(100,0);
		Money eric = new Money(50,0);
	
		myself.incDollars(100);
		eric.incDollars(-10);
		System.out.println(myself);
	}
}
