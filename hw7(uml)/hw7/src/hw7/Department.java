package hw7;

import java.util.Set;

public class Department {
	//each department within a company is uniquely identified by its name.
	private String name;
	
	//A department usually, but not always, has a manager.
	private String manager = null;
	
	//Each department manufactures many products;
	private Set<Product> manu_products;
}
