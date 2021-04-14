package hw7;

import java.util.Set;

public class Project {
	//A project is staffed by many workers and exactly one manager.
	private Set<Worker> staffed_workers;
	private Manager staffed_manager;
	public void setWorkers(Worker w) {
		staffed_workers.add(w);
	}
	public void setManager(Manager m) {
		staffed_manager = m;
	}
	
	
	//Each project has a name, budget, and internal priority for securing resources.
	private String name;
	private int budget;
	private int[] internal_priority_for_securing = new int[10];
	
	public String getName() {
		return name;
	}
}
