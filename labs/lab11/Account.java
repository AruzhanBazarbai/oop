import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account{
	protected String accountNumber;
	protected Client ownerName;
	protected BigDecimal balance;

	public Account(String accountNumber, Client ownerName, BigDecimal balance) {
		this.accountNumber = accountNumber;
		this.ownerName = new Client(ownerName.getName(), ownerName.getPhone(), ownerName.getId());
		this.balance = balance;
	}

	public abstract void credit(BigDecimal balance);

	public abstract void debit(BigDecimal balance);
}