package hw6;

import java.lang.Math;

public class Addition implements IOperation{
	
	public String perform(String num1, String num2) {
		String ans = "";
		
		if((num1.charAt(0) != '-' && num2.charAt(0) != '-')
				|| (num1.charAt(0) == '-' && num2.charAt(0) == '-')) {
			
			int temp;
			if(num1.charAt(0) != '-') temp = 0;
			else temp = 1;
			int size = Math.max(num1.length()-temp, num2.length()-temp);
			int[] ansarray = new int[size];
			for(int i = 0; i < size; i++) {
				if(i < Math.min(num1.length()-temp, num2.length()-temp))
					ansarray[i] = ((int)num1.charAt(num1.length()-1-i)) + ((int)num2.charAt(num2.length()-1-i)) - 96;
				else if(i < num1.length()-temp)
					ansarray[i] = ((int)num1.charAt(num1.length()-1-i)) - 48;
				else 
					ansarray[i] = ((int)num2.charAt(num2.length()-1-i)) - 48;
			}
			for(int i = 0; i < size-1; i++) {
				while(ansarray[i] > 9) {
					ansarray[i] = ansarray[i] - 10;
					ansarray[i+1]++;
				}
			}
			if(temp == 1) ans = ans + "-";
			for(int i = size-1; i>=0; i--) ans = ans + ansarray[i];
		}
			
		
		return ans;
	}
}
