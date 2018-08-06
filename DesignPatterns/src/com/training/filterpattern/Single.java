package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> maleList = new ArrayList<>();
		for (Person temp : person) {
			if (temp.getMaritalStatus().equals("single")) {
				maleList.add(temp);
			}
		}
		return maleList;
	}

}
