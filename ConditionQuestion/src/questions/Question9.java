package questions;

import java.util.Iterator;

public class Question9 {

	public static void main(String[] args) {

		int i = 0;
		int result = 1;
		
		for (i=1; i<=10; i++) {
		
			result *= i;
			
		}
		System.out.println("결과값은 " + result);
	}

}
