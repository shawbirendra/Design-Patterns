package com.training.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhone11 implements IObservervable {

	private List<IObserver> users;

	private boolean isArrived = true;

	public IPhone11() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(IObserver observer) {
		users.add(observer);

	}

	@Override
	public void remove(IObserver observer) {
		// TODO Auto-generated method stub
		users.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for (IObserver temp : users) {
			temp.update();
		}
	}

	public boolean isArrived() {
		return isArrived;
	}
	public void setArrived(boolean isArrived) {
		this.isArrived = isArrived;
		notifyObserver();
	}

}
