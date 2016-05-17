package data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private String IBAN;
	private double balance;

	public Account(){	
	}
	
	public Account(String iBAN, double balance) {
		super();
		this.IBAN = iBAN;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	@Override
	public String toString() {
		return "Account [IBAN=" + IBAN + ", balance=" + balance +"]";
	}

}
