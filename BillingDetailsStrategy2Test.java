package strategy2;

import org.junit.jupiter.api.Test;

import bank.dao.BaseDAO;
import bank.dao.BaseDAOImpl;

public class BillingDetailsStrategy2Test {

	BaseDAO baseDao = new BaseDAOImpl();
	
	@Test
	public void testCase1() {
		
		BankAccount bankAcc= new BankAccount();
		
		bankAcc.setOwner("Jack");
		bankAcc.setNum("123");
		bankAcc.setBankName("SBI");
		
		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("Jane");
		creditCard.setNum("223");
		creditCard.setType("Coral");
		creditCard.setExpiryMonth("Jan");
		creditCard.setExpiryYear("2025");
		
		baseDao.persist(bankAcc);
		baseDao.persist(creditCard);
	}
}
