package bankexception;
//UNCHECKED category
public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
