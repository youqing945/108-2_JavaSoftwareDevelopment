package hw3;

import java.util.Scanner;

public class SpecialNum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String inputString = keyboard.next();
		keyboard.close();
		String[] inputsplit = inputString.split("=");
		int num = Integer.parseInt(inputsplit[1]);
		
		if(inputsplit[0].compareTo("X")==0) {
			if(isspecialornot(num) == 1) System.out.println("true");
			else System.out.println("false");
		}
		else if(inputsplit[0].compareTo("Y")==0) {
			int test = 1, ans = 1, now = 2;
			while(now <= num) {
				test++;
				if(isspecialornot(test) == 1) {
					ans = test;
					now++;
				}
			}
			System.out.println(ans);
		}
		else {
			
		}
		
	}
	
	public static int isspecialornot(int data) {
		while(data % 2 == 0) data = data / 2;
		while(data % 3 == 0) data = data / 3;
		while(data % 5 == 0) data = data / 5;
		if(data == 1) return 1;
		else return 0;
	}
}
