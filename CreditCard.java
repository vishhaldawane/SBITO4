package strategy1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="CreditCard1")
@DiscriminatorValue("CA")
public class CreditCard extends BillingDetails {

	@Column(length=10)
	String type;
	
	@Column(length=10)
	String expiryMonth;
	
	@Column(length=10)
	String expiryYear;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
}
