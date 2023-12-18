package entities;

public class SavingAccount extends Account {
	private Double interestRate;

	public SavingAccount() {
		super();

	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;

	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance(Double interestRate) {
		balance += balance * interestRate;
	}

	// sobreposicao ou sobrescrita 

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}