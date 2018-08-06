package com.training.strategy;

public class Item {

	private String itemCode;
	private int price;
	private int qty;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String itemCode, int price, int qty) {
		super();
		this.itemCode = itemCode;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", price=" + price + ", qty=" + qty + "]";
	}

	protected String getItemCode() {
		return itemCode;
	}

	protected void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	protected int getQty() {
		return qty;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

}
