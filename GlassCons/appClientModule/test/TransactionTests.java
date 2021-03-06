package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import app.RestJson;
import data.Transac;

public class TransactionTests {

	Transac transaction;

	@Before
	public void initialize() {
		try {
			transaction = RestJson.getListTransac().get(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void transactionIdNotNull() {
		Assert.assertNotNull(transaction.getId());
	}

	@Test
	public void transactionIdIsSet() {
		Assert.assertTrue(transaction.getId() != 0);
	}

	@Test
	public void transactionDateNotNull() {
		Assert.assertNotNull(transaction.getDate());
	}

	@Test
	public void typeNotNull() {
		Assert.assertNotNull(transaction.getType());
	}

	@Test
	public void typeIsSet() {
		Assert.assertTrue(transaction.getType().length() != 0);
	}
	
	@Test
	public void typeIsOk() {
		Assert.assertTrue((transaction.getType().equals("Debit"))||(transaction.getType().equals("Credit")));
	}

	@Test
	public void amountNotNull() {
		Assert.assertNotNull(transaction.getAmount());
	}

	@Test
	public void amountIsSet() {
		Assert.assertTrue(transaction.getAmount() != 0);
	}

	@Test
	public void customerIdNotNull() {
		Assert.assertNotNull(transaction.getCustomerId());
	}

	@Test
	public void customerIdIsSet() {
		Assert.assertTrue(transaction.getCustomerId() != 0);
	}

}
