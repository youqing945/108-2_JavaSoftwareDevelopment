package hw7;

import java.util.Set;

//There are two types of persons: workers and managers.
public class Worker extends Person{
	//Each worker works on many projects;
	private Set<Project> working_projects;
	
	//A person may charge time to projects and earn a salary.
	public void doProject(Project p) {
		p.setWorkers(this);
		working_projects.add(p);
		System.out.println("Worker " + name +" do project " + p.getName() + " and get $!");
	}
}
