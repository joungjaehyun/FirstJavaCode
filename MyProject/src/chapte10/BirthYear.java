package chapte10;

import java.util.Scanner;

public class BirthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
		//이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
		Scanner sc =new Scanner(System.in);
		System.out.println("생년을 입력해주세요");
		String birthYear = sc.nextLine();
		try {
			int birth = Integer.parseInt(birthYear);
			if (birth <0|| birth<999) {
				BirthNegative e =new BirthNegative();
				throw e;
			}
			
			System.out.println("생일은 " +birth +"년 입니다.");
		}catch(BirthNegative e) {
			System.out.println(e.getMessage());
			System.out.println("정수만 입력해 주세요");
			e.printStackTrace();
		}
	
	}

}
