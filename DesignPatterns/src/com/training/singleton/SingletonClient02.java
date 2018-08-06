package com.training.singleton;
//for lazy singleton

class Company {
	private Company() {
		System.out.println("Constructor is called");
	}

	public static Company getInstance(Company company) {
		if (company == null) {
			return new Company();
		}
		return company;
	}
}

class Emp {
	int empID;
	String ename;
	Company company;
}

public class SingletonClient02 {
	public static void main(String[] args) {
    Company company=null;
    company=Company.getInstance(company);
    
    Emp emp1=new Emp();
    emp1.empID=101;
    emp1.ename="Birendra";
    emp1.company=company;
    
    System.out.println(emp1.company.hashCode());
    
    Emp emp2=new Emp();
    emp2.empID=101;
    emp2.ename="Birendra";
    emp2.company=company;
    System.out.println(emp2.company.hashCode());

	}
}
