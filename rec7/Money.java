public class Money {
	public int dollars;
	public int cents;

	public Money(int dollars, int cents) {
		this.dollars = dollars + cents / 100;
		this.cents = cents % 100;
	}

	public void swapDollarsAndCents() {
		int tmp = dollars;
		dollars = cents;
		cents = tmp;
	}

	public void add(Money other) {
		dollars += other.dollars;
		cents += other.cents;
		if(cents > 99) {
			dollars++;
			cents -= 100;
		}
	}

	public void set(int dollars, int cents) {
		this.dollars = dollars + cents / 100;
		this.cents = cents % 100;
	}

	public void incDollars(int dollars) {
		this.dollars += dollars;
	}

	public void incCents(int cents) {
		this.dollars += cents / 100;
		this.cents += cents % 100;
	}

	public void setEqualTo(Money other) {
		dollars = other.dollars;
		cents = other.cents;
	}

	public String toString(){
		return "$"+dollars+"."+cents;
	}
}
