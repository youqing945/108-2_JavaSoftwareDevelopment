package hw5;

public class File extends Document{
	private String pathname;
	
	//============
	public String toString() {
		String fin;
		fin = "Path: " + getPathname() + "\n";
		fin = fin + text + "\n";
		
		return fin;
	}
	//============
	
	public void setPathname(String str1) {
		pathname = str1;
	}
	
	public String getPathname() {
		return pathname;
	}
}
