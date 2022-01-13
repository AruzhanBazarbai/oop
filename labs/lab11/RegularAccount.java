import java.math.BigDecimal;

public class RegularAccount extends Account{
	public RegularAccount(String number,Client owner, BigDecimal balance) {
		super(number,owner, balance);
	}

	@Override
	public void credit(BigDecimal balance){
		super.balance = super.balance.add(balance);
	}

	@Override
	public void debit(BigDecimal balance) {
		BigDecimal newBalance = super.balance.subtract(balance).subtract(new BigDecimal("50.00"));

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Not enough money");
		}

		super.balance = newBalance;
	}
	
}