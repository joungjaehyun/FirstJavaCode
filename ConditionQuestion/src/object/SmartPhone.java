package object;

import java.util.Scanner;

public class SmartPhone {

	Contact[] contact = new Contact[10];

	static Scanner in = new Scanner(System.in);

	public void saveData(int i) {

		for (i = 0; i < 10; i++) {
			System.out.println("이름을 입력해 주세요>>");
			contact[i].setName(in.nextLine());
			System.out.println("전화번호를 입력해 주세요 >>");
			contact[i].setPhoneNumber(in.nextLine());
			System.out.println("이메일을 입력해 주세요 >>");
			contact[i].setEmail(in.nextLine());
			System.out.println("주소를 입력해 주세요");
			contact[i].setaddress(in.nextLine());
			System.out.println("생일을 입력해 주세요");
			contact[i].setBirth(in.nextLine());
			System.out.println("그룹을 입력해 주세요");
			contact[i].setGroup(in.nextLine());
			System.out.println(i + "번째에 저장되었습니다.");
		}
		System.out.println(i+"번부터 마지막까지 다 저장 되었습니다.");
	}

	public void updateData() {
		System.out.println("숫자를 입력해 주세요");
		int i = in.nextInt();
		if (i > 10) {
			System.out.println("index 보다 커서 입력 저장불가능합니다.");
		} else {
			if (contact[i].getName() == null) {
				System.out.println("이름을 입력해 주세요>>");
				contact[i].setName(in.nextLine());
			}
			System.out.println("바꿀이름을 입력해 주세요>>");
			contact[i].setName(in.nextLine());
			System.out.println("바꿀전화번호를 입력해 주세요 >>");
			contact[i].setPhoneNumber(in.nextLine());
			System.out.println("바꿀이메일을 입력해 주세요 >>");
			contact[i].setEmail(in.nextLine());
			System.out.println("바꿀주소를 입력해 주세요");
			contact[i].setaddress(in.nextLine());
			System.out.println("바꿀생일을 입력해 주세요");
			contact[i].setBirth(in.nextLine());
			System.out.println("바꿀그룹을 입력해 주세요");
			contact[i].setGroup(in.nextLine());
			System.out.println(i + "번째가 변경되었습니다.");
		}
	}

	public void deleteData(int i) {
		System.out.println("숫자를 입력해 주세요");
		 i = in.nextInt();
		if (i > 10) {
			System.out.println("index 보다 커서 입력 저장불가능합니다.");
		} else {
			contact[i].setName(null);
			contact[i].setPhoneNumber(null);
			contact[i].setEmail(null);
			contact[i].setaddress(null);
			contact[i].setBirth(null);
			contact[i].setGroup(null);
			System.out.println(i + "번째가 삭제되었습니다.");
		}
	}

	public void showData() {
		for (int i = 0; i < contact.length; i++) {
			contact[i].showData();
		}
	}
}
