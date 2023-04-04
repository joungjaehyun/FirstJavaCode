package chapte10;

import java.util.Scanner;

public class InputIdRegularExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해 주세요");
		String id = sc.nextLine();
		
		try {
			boolean checking =false;
			checking = id.matches("[a-zA-Z0-9]");
			if (!checking) {
				BadIdInputException e = new BadIdInputException();
				throw e;
			}
			System.out.println("아이디는 " + id);
		}
		catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		}
	}
}
