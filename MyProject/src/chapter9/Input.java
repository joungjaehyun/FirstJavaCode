package chapter9;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요 >>");
		String putName = in.nextLine();
		
		if (putName.trim().isEmpty()) {
			System.out.println("입력한 값이 없습니다.");
		}else {
			System.out.println("입력한 이름은 " +putName);
		}
	}
}
