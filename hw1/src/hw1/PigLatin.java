package hw1;

public class PigLatin {
	public static void main(String[] args) {
		for(int i = 0; i<args.length; i++) {
			String str = args[i];
			int len = str.length();
			if(str.substring(0,1).equalsIgnoreCase("a") 
					|| str.substring(0,1).equalsIgnoreCase("e")
					|| str.substring(0,1).equalsIgnoreCase("i")
					|| str.substring(0,1).equalsIgnoreCase("o")
					|| str.substring(0,1).equalsIgnoreCase("u")) {
				System.out.print(str.substring(0,1).toUpperCase()+str.substring(1,len)+"ay");
			}
			else System.out.print(str.substring(1,2).toUpperCase()+str.substring(2,len)+str.substring(0,1)+"ay");
			if(i != args.length-1) System.out.print(" ");
			else System.out.println();
		}
	}
}
