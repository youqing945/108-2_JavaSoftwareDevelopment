package hw7;

import java.util.Set;

public class Person {
	//A person has a name, address, and social security number.
	protected String name;
	protected String address;
	protected String social_security_num;
	
	//Person and Company have a many-to-many relationship.
	protected Set<Company> companies;
	
	//A person may charge time to projects and earn a salary.
	public void doProject(Project p) {
		System.out.println("not worker or manager");
	}
	
}
