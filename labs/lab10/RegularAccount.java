import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RegularAccount extends Account{
	public RegularAccount(String number, String status, Client owner, BigDecimal balance) {
		super(number, status, owner, balance);
	}

	@Override
	public void credit(BigDecimal balance){
		super.balance = super.balance.add(balance);
		
		Operation op = new Operation(
			"Credit",
			balance,
			LocalDateTime.now());
		operations.add(op);
	}

	@Override
	public void debit(BigDecimal balance) {
		BigDecimal newBalance = super.balance.subtract(balance).subtract(new BigDecimal("50.00"));

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Not enough money");
		}

		super.balance = newBalance;
		Operation operation = new Operation(
				"Debit", balance, LocalDateTime.now()
			);
		operations.add(operation);
	}

	@Override
	public void paymentForService() {
		balance = balance.subtract(new BigDecimal("2000.00"));
	}

	@Override
	protected String balanceBuilder(){
		return "Your balance is " + balance.toString();
	}

	@Override
	public void getStatement(){
		StringBuilder sb = new StringBuilder();
		sb.append("Account statement\n");
		for (Operation s: super.operations) {
			if (s == null) {
				break;
			}
			sb.append(s.toString()).append("\n");
		}
		System.out.println(sb);
	}
	
}