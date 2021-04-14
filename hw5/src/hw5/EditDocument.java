package hw5;

import java.util.Scanner;

public class EditDocument {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String mode = keyboard.nextLine();
		String type = keyboard.nextLine();
		
		Document doc;
		
		if(type.equals("Document")) {
			doc = new Document();
		}
		else if(type.equals("Email")) {
			doc = new Email();
			((Email)doc).setSender(keyboard.nextLine());
			((Email)doc).setRecipient(keyboard.nextLine());
			((Email)doc).setTitle(keyboard.nextLine());
		}
		else if(type.equals("File")) {
			doc = new File();
			((File)doc).setPathname(keyboard.nextLine());
		}
		else doc = new Document();
		
		doc.setText(keyboard.nextLine());
		
		//==================================
		
		//print content
		if(mode.equals("A")) { 
			System.out.println(doc.toString());
		}
		//find keyword
		else if(mode.equals("B")) {
			if(doc.toString().indexOf(keyboard.nextLine())!=-1) {
				System.out.println(true);
			}
			else System.out.println(false);
		}
		//edit content
		else if(mode.equals("C")) {
			String editting = keyboard.nextLine();
			if(editting.equals("text")) {
				doc.setText(keyboard.nextLine());
			}
			else {
				if(doc instanceof Email) {
					if(editting.equals("sender")) {
						((Email)doc).setSender(keyboard.nextLine());
					}
					else if(editting.equals("recipient")) {
						((Email)doc).setRecipient(keyboard.nextLine());
					}
					else if(editting.equals("title")) {
						((Email)doc).setTitle(keyboard.nextLine());
					}
				}
				else if(doc instanceof File) {
					if(editting.equals("pathname")) {
						((File)doc).setPathname(keyboard.nextLine());
					}
				}
			}
			
			System.out.println(doc.toString());
		}
			
		
	}
}
