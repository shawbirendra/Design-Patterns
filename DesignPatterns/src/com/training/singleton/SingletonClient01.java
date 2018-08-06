package com.training.singleton;
//working of eager
public class SingletonClient01 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		// shall give the storage location
		System.out.println(singleton.hashCode());

		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());


	}
}
