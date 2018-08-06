package com.training.strategy;

public class CreditCard implements Payment {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	private double discount;
	private String bankName;

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpiry="
				+ dateOfExpiry + ", discount=" + discount + ", bankName=" + bankName + "]";
	}

	public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry, double discount,
			String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getCardNumber() {
		return cardNumber;
	}

	protected void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	protected String getCvv() {
		return cvv;
	}

	protected void setCvv(String cvv) {
		this.cvv = cvv;
	}

	protected String getDateOfExpiry() {
		return dateOfExpiry;
	}

	protected void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	protected double getDiscount() {
		return discount;
	}

	protected void setDiscount(double discount) {
		this.discount = discount;
	}

	protected String getBankName() {
		return bankName;
	}

	protected void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public final void pay(int amount) {
		if (this.bankName.equalsIgnoreCase("hdfc")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("paying with HDFC and got discount of 10%, paid " + amount);
		} else {
			System.out.println("paid amount of " + amount);
		}
	}

}
