package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singleton singleton = Singleton.getInstance();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Sample.ser"));
		oos.writeObject(singleton);

		System.out.println("object saved with hashcode:" + singleton.hashCode());
		oos.close();
		///////////// deserialize///////////
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Sample.ser"));
		Singleton singleton2 = (Singleton) ois.readObject();
		ois.close();
		System.out.println(singleton2.hashCode());
	}
}
