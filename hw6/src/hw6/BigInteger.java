package hw6;

import java.util.Scanner;

public class BigInteger {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		String[] tokens = input.split(" ");
		int num = tokens.length;
		String finalans = tokens[0];
		
		for(int i = 1; i < num; i = i + 2) {
			IOperation operation;
			
			if(tokens[i].equals("+")) {
				if((finalans.charAt(0) == '-' && tokens[i+1].charAt(0) == '-')
						|| (finalans.charAt(0) != '-' && tokens[i+1].charAt(0) != '-')) {
					operation = new Addition();
					//System.out.println("+++or-+-");
				}
				else {
					operation = new Subtraction();
					if(finalans.charAt(0)=='-') {
						String[] temp = finalans.split("-");
						finalans = tokens[i+1];
						tokens[i+1] = temp[1];
						//System.out.println("-++");
					}
					else {
						String[] temp = tokens[i+1].split("-");
						tokens[i+1] = temp[1];
						//System.out.println("++-");
					}
				}
			}
			else if(tokens[i].equals("-")) {
				if((finalans.charAt(0) == '-' && tokens[i+1].charAt(0) == '-')
						|| (finalans.charAt(0) != '-' && tokens[i+1].charAt(0) != '-')) {
					operation = new Subtraction();
					//System.out.println("+-+or---");
				}
				else {
					operation = new Addition();
					if(finalans.charAt(0)=='-') {
						tokens[i+1] = "-" + tokens[i+1];
						//System.out.println("--+");
					}
					else {
						String[] temp = tokens[i+1].split("-");
						tokens[i+1] = temp[1];
						//System.out.println("+--");
					}
				}
			}
			else operation = new Comparison();
			
			finalans = operation.perform(finalans, tokens[i+1]);
			
			if(operation instanceof Comparison) {
				if((tokens[i].equals(">") && finalans.equals("1"))
						|| (tokens[i].equals("<") && finalans.equals("-1"))
						|| (tokens[i].equals("=") && finalans.equals("0"))) {
					finalans = "true";
				}
				else finalans = "false";
			}
		}
		
		System.out.println(finalans);
		
	}
}
