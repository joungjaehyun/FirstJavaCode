package questions;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 250;

		if (num < 0) {

			System.out.println("num은 0미만");
		} else {

			switch (num / 100) {
			case 1: {

				System.out.println("num은 100이상 200미만");
				break;
			}
			case 2: {
				System.out.println("num은 200이상 300미만");
				break;
			}
			case 3: {
				
				System.out.println("num은 300이상");
				break;
			}
			default:
				System.out.println("num은 400이상");
			}
		}
	}

}
