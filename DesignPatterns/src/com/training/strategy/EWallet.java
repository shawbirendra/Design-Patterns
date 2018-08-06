package com.training.strategy;

public class EWallet implements Payment {
	private String email;
	private String password;
	private String walletName;

	public EWallet() {
	}

	@Override
	public String toString() {
		return "EWallet [email=" + email + ", password=" + password + ", walletName=" + walletName + "]";
	}

	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getWalletName() {
		return walletName;
	}

	protected void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	@Override
	public void pay(int amount) {
		if (walletName.equalsIgnoreCase("paytm")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("paying with Paytm, and  paid " + amount);
		} else {
			System.out.println("paid amount of " + amount + " with wallet " + this.walletName);
		}
	}

}
