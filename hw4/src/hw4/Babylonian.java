package hw4;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;;

public class Babylonian {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double n = keyboard.nextDouble();
		double g = n/2;
		double new_g;
		while(1>0) {
			new_g = (g+(n/g))/2;
			if((g-new_g)/g<=0.01) break;
			else g = new_g;
		}
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(Math.round(new_g*100.0)/100.00));
	}
}
