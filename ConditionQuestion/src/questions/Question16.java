package questions;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0;

		while (i < 100) {

			sum += i;
			i++;

		}

		System.out.println(sum);
		System.out.println();

	
		sum = 0;
		do {
			sum += i;
			i++;

		} while (i < 100);
		
		System.out.println(sum);
		System.out.println();

		i = 0;
		sum = 0;

		for (i = 1; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
	}
}
