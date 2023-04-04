package chapte10;

import java.util.Scanner;

public class InputID {
	// 1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을
	// 입력했는지 확인하는 프로그램을 만들어봅시다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요 >>");
		String id= sc.nextLine();
		
		try {
			for(int i=0; i<id.length(); i++) {
				
				if (!((id.charAt(i)>='a'&&id.charAt(i)<='z')||
						(id.charAt(i)>='A'&&id.charAt(i)<='Z')
						||(id.charAt(i)>='0'&&id.charAt(i)<='9'))) {
					BadIdInputException e = new BadIdInputException();
							throw e;
							}
								
							
				
				}
			System.out.println("아이디는 " +id);
			}
				
				catch(BadIdInputException e){
					System.out.println(e.getMessage());
				}
			
		
		
	}
}
