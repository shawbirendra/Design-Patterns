package com.training.strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
	public static void main(String[] args) {
		Item item1 = new Item("APL101-Apple", 20, 5);
		Item item2 = new Item("SH0123-Shirts", 1500, 3);
		Item item3 = new Item("JE032150-Jeans", 2000, 2);
		Item item4 = new Item("TS587-Tshirts", 799, 8);

		List<Item> items = Stream.of(item1,item2,item3,item4)
				.collect(Collectors.toList());

		ShoppingCart cart2 = new ShoppingCart();
		cart2.addItems(items);

//		ShoppingCart cart = new ShoppingCart();
//		cart.addItem(item1);
//		cart.addItem(item2);
//		cart.addItem(item3);
//		cart.addItem(item4);

		System.out.println("Total Amt: " + cart2.calculateTotal());
		// cart.checkOut(new CreditCard("Birendra", "2145632548", "253", "02/92", 10,
		// "icici"));

		cart2.checkOut(new EWallet("krs.birendra@gmail.com", "abcd@1234", "paytm"));

	}
}
