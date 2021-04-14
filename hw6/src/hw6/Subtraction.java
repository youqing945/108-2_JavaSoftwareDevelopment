package hw6;

public class Subtraction implements IOperation{

	public String perform(String num1, String num2) {
		if(num1.charAt(0) == '-') {
			String[] temp1 = num1.split("-");
			String[] temp2 = num2.split("-");
			num1 = temp2[1];
			num2 = temp1[1];
			//System.out.println(num1+" "+num2);
		}
		
		String ans = "";
		int size = Math.max(num1.length(), num2.length());
		int[] ansarray = new int[size];
		for(int i = 0; i < size; i++) {
			if(i < Math.min(num1.length(), num2.length()))
				ansarray[i] = ((int)num1.charAt(num1.length()-1-i)) - ((int)num2.charAt(num2.length()-1-i));
			else if(i < num1.length())
				ansarray[i] = ((int)num1.charAt(num1.length()-1-i)) - 48;
			else 
				ansarray[i] = -((int)num2.charAt(num2.length()-1-i)) + 48;
		}
		
		int itsnor0 = 1;
		for(int i = size-1; i>=0; i++) {
			if(ansarray[i] == 0 && i != 0 ) size--;
			else if (ansarray[i] < 0) {
				itsnor0 = 0;
				break;
			}
			else break;
		}
		
		if(itsnor0 == 1) {
			for(int i = 0; i < size-1; i++) {
				while(ansarray[i] < 0) {
					ansarray[i] = ansarray[i] + 10;
					ansarray[i+1]--;
				}
			}
			for(int i = size-1; i>=0; i--) ans = ans + ansarray[i];
		}
		else {
			for(int i = 0; i < size-1; i++) {
				while(ansarray[i] > 0) {
					ansarray[i] = ansarray[i] - 10;
					ansarray[i+1]++;
				}
			}
			ans = ans + "-";
			for(int i = size-1; i>=0; i--) ans = ans + (-ansarray[i]);
		}
		
		return ans;
	}
}
