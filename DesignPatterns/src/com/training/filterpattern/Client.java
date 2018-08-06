package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Birendra", "male", "single"));
		list.add(new Person("Divya", "female", "single"));
		list.add(new Person("Rupa", "female", "Married"));
		list.add(new Person("Shilpa", "female", "Married"));
		list.add(new Person("Rakesh", "male", "Married"));
		list.add(new Person("Suresh", "male", "single"));
		list.add(new Person("Vinod", "male", "Married"));

		ICriteria maleCriteria = new Male();
		System.out.println("==========Only Males============");
		maleCriteria.meetCriteria(list).forEach(System.out::println);

		System.out.println();
		ICriteria femaleCriteria = new Female();
		System.out.println("==========Only Females============");
		femaleCriteria.meetCriteria(list).forEach(System.out::println);

		System.out.println();
		ICriteria married = new Married();
		System.out.println("==========Only Married============");
		married.meetCriteria(list).forEach(System.out::println);

		System.out.println();
		ICriteria single = new Single();
		System.out.println("==========Only Single============");
		single.meetCriteria(list).forEach(System.out::println);
		
		
		ICriteria maleCriteria1=new Male();
		ICriteria singleCriteria1=new Single();
		ICriteria marriedCriteria=new Married();
		ICriteria femaleCriteria1=new Female();
		
		
		
		ICriteria andCriteria=new AndCriteria(maleCriteria1, singleCriteria1);
		System.out.println("==========Only single Males============");
		andCriteria.meetCriteria(list).forEach(System.out::println);
		;

	}
}
