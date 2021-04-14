package hw2;

//Chapter 3
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;;

public class Quadratic {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		double a, b, c, ans1, ans2;
		String format;
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		format = keyboard.next();
		
		DecimalFormat dFormat = new DecimalFormat(format);
		
		ans1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		ans2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		
		if(a>=0) {
			if(ans1>=ans2) {
				System.out.println(dFormat.format(ans1));
				System.out.println(dFormat.format(ans2));
			}
			else {
				System.out.println(dFormat.format(ans2));
				System.out.println(dFormat.format(ans1));
			}
		}
		else {
			if(ans1<=ans2) {
				System.out.println(dFormat.format(ans1));
				System.out.println(dFormat.format(ans2));
			}
			else {
				System.out.println(dFormat.format(ans2));
				System.out.println(dFormat.format(ans1));
			}
		}
	}
	
}
