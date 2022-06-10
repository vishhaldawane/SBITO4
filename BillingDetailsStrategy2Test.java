package strategy4;

import org.junit.jupiter.api.Test;

import bank.dao.BaseDAO;
import bank.dao.BaseDAOImpl;

public class BillingDetailsStrategy2Test {

	BaseDAO baseDao = new BaseDAOImpl();
	
	@Test
	public void testCase1() {
		
		BillingDetails billDet = new BillingDetails();
		billDet.setNum("100");
		billDet.setOwner("King");
		
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
		
		baseDao.persist(billDet);
		baseDao.persist(bankAcc);
		baseDao.persist(creditCard);
	}
}
