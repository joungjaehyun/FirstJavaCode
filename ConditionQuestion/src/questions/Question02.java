package questions;

public class Question02 {

	public static void main(String[] args) {
		int num = 0;
		
		if(num >= 300) {
			System.out.println("num은 300이상");

		}
		else if(num >= 200 ) {
			System.out.println("num은 300미만 200이상");
		}
		else if(num >= 100) {
			System.out.println("num은 200미만 100이상");
		}
		else if(num >= 0) {
			System.out.println("num은 0이상 100미만");
		}
		else {
			System.out.println("num은 0미만 ");
		}
		
		

	}

}
