package questions.answer;

public class Answer13 {
	public static void main(String[] args) {

		for (int i = 2; i < 9; i*=2) { //증가식의 패턴
			//System.out.println(i);
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " X " + j + " = " + i * j + " \n") ;
			}
			
		System.out.println();
		}
		
	}
}
