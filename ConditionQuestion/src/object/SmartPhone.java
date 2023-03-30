package object;

import java.util.Iterator;
import java.util.Scanner;

public class SmartPhone {

	int count = 0;
	Contact[] contact = new Contact[10];

	static Scanner in = new Scanner(System.in);

	public void saveData() {

			System.out.println("이름을 입력해 주세요>>");
			String name =in.nextLine();
			System.out.println("전화번호를 입력해 주세요 >>");
			String phoneNumber = in.nextLine();
			System.out.println("이메일을 입력해 주세요 >>");
			String email = in.nextLine();
			System.out.println("주소를 입력해 주세요");
			String address =in.nextLine();
			System.out.println("생일을 입력해 주세요");
			String birth = in.nextLine();
			System.out.println("그룹을 입력해 주세요");
			String group = in.nextLine();
			contact[count] = new Contact(name, phoneNumber, email, address, birth, group);
			count++;	
	}

	public void updateData() {
			

			System.out.println("이름을 입력해 주세요>>");
			String name = in.nextLine();
			for (int i = 0; i < contact.length; i++) {
				if (contact[i].getName().equals(name)) {
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
					contact[i].showData();
					System.out.println("변경되었습니다.");
					break;
				
				}
			}
			
			
		
		
	}

	public void deleteData() {
		
		System.out.println("이름을 입력해 주세요");
		String name=in.nextLine();
		
		
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getName().equals(name)) {
				contact[i].setName("");
				contact[i].setPhoneNumber("");
				contact[i].setEmail("");
				contact[i].setaddress("");
				contact[i].setBirth("");
				contact[i].setGroup("");
				count--;
				break;
			}
		}
			
		
	}
	public void searchData() {
		System.out.println("이름을 입력해 주세요>>");
		String name = in.nextLine();
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getName().equals(name)) {
				contact[i].showData();
				break;}
			}
	}

	public void showData() {
		for (int i = 0; i < 10; i++) {
			contact[i].showData();
		}
	}

}
