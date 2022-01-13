import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation{
	private String operationType;
	private BigDecimal amount;
	private LocalDateTime time;	

	public Operation(String operationType, BigDecimal amount, LocalDateTime time) {
		this.operationType = operationType;
		this.amount = amount;
		this.time = time;
	}

	@Override
	public String toString() {
		return "{" + operationType + " " + amount.toString() + " " + time.toString() + " ";
	}
}