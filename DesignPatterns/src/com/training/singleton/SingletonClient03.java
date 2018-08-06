package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//to acess singleton(eager) through reflection
public class SingletonClient03 {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = null;
		Singleton singleton3 = null;

		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// with this we can access private methods
			constructor.setAccessible(true);
			singleton2 = (Singleton) constructor.newInstance();
			singleton3 = (Singleton) constructor.newInstance();
			break;

		}
		System.out.println("insatance one: " + singleton1.hashCode());
		System.out.println("insatance two: " + singleton2.hashCode());
		System.out.println("insatance three: " + singleton3.hashCode());
	}
}
