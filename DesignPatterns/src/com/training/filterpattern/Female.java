package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> maleList = new ArrayList<>();
		for (Person temp : person) {
			if (temp.getSex().equals("female")) {
				maleList.add(temp);
			}
		}
		return maleList;
	}

}
