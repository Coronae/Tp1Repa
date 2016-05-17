package pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transac {

	private int transactionId;
	private String type;
	private double amount;
	private long customerId;

	public Transac() {
	}

	public Transac(int id, String type, double amount, int cId) {
		this.transactionId = id;
		this.type = type;
		this.amount = amount;
		this.customerId = cId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", type=" + type + ", amount=" + amount + ", customerId="
				+ customerId + "]";
	}

}