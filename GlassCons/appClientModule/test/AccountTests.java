package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import app.RestJson;
import data.Account;

public class AccountTests {


	Account account;

	@Before
	public void initialize() {
		try {
		account = RestJson.getListAccount().get(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void accountIBANNotNull() {
		Assert.assertNotNull(account.getIBAN());
	}

	@Test
	public void accountIBANIsSet() {
		Assert.assertTrue(account.getIBAN() != 0);
	}

	@Test
	public void balanceNotNull() {
		Assert.assertNotNull(account.getBalance());
	}

	@Test
	public void balanceIsSet() {
		Assert.assertTrue(account.getBalance() != 0);
	}
	
}
