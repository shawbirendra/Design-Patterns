package com.training.observer;

public class Users implements IObserver {
	private IObservervable iObservervable = null;
	private String name;

	// the cons. is a mapper b/w the enduser and the notification(product)

	public Users() {
	}

	public Users(IObservervable iObservervable, String name) {
		super();
		this.iObservervable = iObservervable;
		this.name = name;
	}

	public void buyMobile() {
		System.out.println("Hurrey..!  i've bought OnePlus6T, by " + name);
	}

	@Override
	public void update() {
		buyMobile();

	}

	public void unSubscribe() {
		iObservervable.remove(this);
	}

}
