package data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private int IBAN;
	private double balance;

	public Account() {
	}

	public Account(int iBAN, double balance) {
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

	public int getIBAN() {
		return IBAN;
	}

	public void setIBAN(int iBAN) {
		IBAN = iBAN;
	}

	@Override
	public String toString() {
		return "Account [IBAN=" + IBAN + ", balance=" + balance + "]";
	}

	public void crediter(Transac transaction) {
		this.balance += transaction.getAmount();
	}

	public void debiter(Transac transaction) {
		this.balance -= transaction.getAmount();
	}

}
