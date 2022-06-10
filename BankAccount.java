package strategy1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="BankAccount1")
@DiscriminatorValue("BA")
public class BankAccount extends BillingDetails {

	@Column(length=10)
	String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
}
