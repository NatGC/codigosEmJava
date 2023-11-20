package exemploBancoCodigo;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) {
		balance +=  amount;
				
	}
	
	public void withdraw (double amount) {
		  balance -= amount + 5;
		 
		 if (this.balance<0) {
		 System.out.println("Atenção: saldo negativo!");
		 }
	}
	
	
	public String tostring() {
		return number
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
	
	
}
