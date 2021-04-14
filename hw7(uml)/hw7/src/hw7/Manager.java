package hw7;

import java.util.Set;

//There are two types of persons: workers and managers.
public class Manager extends Person{
	//each manager is responsible for many projects.
	private Set<Project> responsible_projects;
	
	//Most managers manage a department;
	//a few managers are not assigned to any department. 
	private Department department;
	
	//A person may charge time to projects and earn a salary.
	public void doProject(Project p) {
		p.setManager(this);
		responsible_projects.add(p);
		System.out.println("Manager " + name +" is responsible for project " + p.getName() + " and get $!");
	}
}
