package All_interviewprograms;

import java.util.Iterator;

public class Stringreverse {

	
	
	public static void main(String[] args) {
		
		String s="javajava";
		String r = null;
		
		for (int i =s.length()-1; i > 0; i--) {
			
		char c = s.charAt(i);
			
		
		r=r+c;
		System.out.println(r);
		System.out.println("tests");
		}
		
		
	}
}
