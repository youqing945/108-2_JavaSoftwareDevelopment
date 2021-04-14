package hw6;

public class Comparison implements IOperation{

	public String perform(String num1, String num2) {
		int ans1 = 0;
		int ans2 = 0;
		
		if((num1.charAt(0) != '-' && num2.charAt(0) == '-') || (num1.charAt(0) == '-' && num2.charAt(0) != '-')) {
			if(num1.charAt(0) != '-') {
				ans1 = 1;
				ans2 = -1;
			}
			else {
				ans1 = -1;
				ans2 = 1;
			}
		}
		else {
			
			int subornot, temp;
			if(num1.charAt(0) == '-') {
				subornot = -1;
				temp = 1;
			}
			else {
				subornot = 1;
				temp = 0;
			}
			
			if(num1.length() > num2.length()) {
				ans1 = 1;
				ans2 = -1;
			}
			else if(num1.length() < num2.length()) {
				ans1 = -1;
				ans2 = 1;
			}
			else {
				for(int i = temp; i < num1.length(); i++) {
					if(num1.charAt(i) > num2.charAt(i)) {
						ans1 = 1;
						ans2 = -1;
						break;
					}
					else if(num1.charAt(i) < num2.charAt(i)) {
						ans1 = -1;
						ans2 = 1;
						break;
					}
				}
			}
			
			ans1 = ans1*subornot;
			ans2 = ans2*subornot;
		}
		if(ans1 > ans2) return "1";
		else if(ans1 < ans2) return "-1";
		else return "0";
	}
}
