package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> maleList = new ArrayList<>();
		for (Person temp : person) {
			if (temp.getMaritalStatus().equalsIgnoreCase("married")) {
				maleList.add(temp);
			}
		}
		return maleList;
	}

}
