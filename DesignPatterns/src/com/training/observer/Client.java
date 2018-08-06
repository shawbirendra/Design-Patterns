package com.training.observer;

public class Client {
	public static void main(String[] args) {
		IObservervable iObservervable = new IPhone11();
		IObserver user1 = new Users(iObservervable, "Birendar");
		IObserver user2 = new Users(iObservervable, "Divya");
		IObserver user3 = new Users(iObservervable, "Rupa");
		IObserver user4 = new Users(iObservervable, "Ankit");
		
		IObservervable iObservervable2 = new OnePlus6T();
		IObserver OnePlus6Tuser1 = new Users(iObservervable, "Birendar");
		IObserver OnePlus6Tuser2 = new Users(iObservervable, "Divya");
		IObserver OnePlus6Tuser3 = new Users(iObservervable, "Rupa");
		IObserver OnePlus6Tuser4 = new Users(iObservervable, "Ankit");

		iObservervable2.addUser(OnePlus6Tuser1);
		iObservervable2.addUser(OnePlus6Tuser2);
		iObservervable2.addUser(OnePlus6Tuser3);
		iObservervable2.addUser(OnePlus6Tuser4);
		
		iObservervable.addUser(user1);
		iObservervable.addUser(user2);

		iObservervable.addUser(user3);

		iObservervable.addUser(user4);

		((IPhone11) iObservervable).setArrived(true);
		System.out.println("==============ONEPLUS6T==========");
		//
		((OnePlus6T) iObservervable2).setArrived(true);

	}
}
