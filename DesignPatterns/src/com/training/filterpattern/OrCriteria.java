package com.training.filterpattern;

import java.util.List;

public class OrCriteria implements ICriteria {
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;

	public OrCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> first = firstCriteria.meetCriteria(person);
		List<Person> second = secondCriteria.meetCriteria(person);

		first.addAll(second);
		return first;
	}

}
