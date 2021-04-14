package hw5;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	
	//=============
	public String toString() {
		String fin; 
		fin = "From: " + getSender() + "\n";
		fin = fin + "To: " + getRecipient() + "\n";
		fin = fin + "Title: " + getTitle() + "\n";
		fin = fin + text + "\n";
		
		return fin;
	}
	//=============
	
	public void setSender(String str1) {
		sender = str1;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setRecipient(String str1) {
		recipient = str1;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setTitle(String str1) {
		title = str1;
	}
	
	public String getTitle() {
		return title;
	}
}
