package hw7;

import java.util.Set;

public class Company {
	//A company has a name, address, phone number, and primary product.
	private String name;
	private String address;
	private String phone_num;
	private Product primary_product;
	
	//A company hires and fires persons. 
	//Person and Company have a many-to-many relationship.
	private Set<Person> employees;
	public void hirePerson(Person p) {
		p.companies.add(this);
		employees.add(p);
	}
	public void firePerson(Person p) {
		p.companies.remove(this);
		employees.remove(p);
	}
	
	// A company is composed of multiple departments;
	private Set<Department> departments;
}
