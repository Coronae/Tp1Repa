package data;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transac {

	private int Id;
	private String type;
	private double amount;
	private int customerId;
	private Date date;

	public Transac() {
	}

	public Transac(int Id, String type, double amount, int customerID) {
		this.Id = Id;
		this.customerId = customerID;
		this.amount = amount;
		this.type = type;
		this.date = new Date();
	}

	public Transac(int Id) {

		this.Id = Id;
		this.customerId = (int) (Math.random() * 10);
		this.type = (Math.random() <= 0.5) ? "Debit" : "Credit";
		this.amount = Math.random() * 250;
		this.date = new Date();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transac [Id=" + Id + ", type=" + type + ", amount=" + amount + ", customerId=" + customerId + "]";
	}

}
