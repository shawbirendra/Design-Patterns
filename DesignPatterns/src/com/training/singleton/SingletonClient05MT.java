package com.training.singleton;

public class SingletonClient05MT extends Thread {
	static Singleton singleton1;
	static Singleton singleton2;

	@Override
	public void run() {
		System.out.println("run....");
		singleton1 = Singleton.getInstance();
		singleton2 = Singleton.getInstance();
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

	public static void main(String[] args) {

		SingletonClient05MT client05mt1 = new SingletonClient05MT();
		
		SingletonClient05MT client05mt2 = new SingletonClient05MT();
		client05mt1.start();
		client05mt2.start();

		

	}
}
