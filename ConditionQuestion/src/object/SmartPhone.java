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
				
				}
			}
			
			
		
		
	}

	public void deleteData() {
		int findMacth =-1;
		System.out.println("이름을 입력해 주세요");
		String name=in.nextLine();
		
		for (int i = 0; i < contact.length; i++) {
			Contact c = contact[i];
			String matchName = c.getName();
			if (c.getName().equals(name)) {
				findMacth = i;
				break;
			}
		}
			contact[findMacth].setName("");
			contact[findMacth].setPhoneNumber("");
			contact[findMacth].setEmail("");
			contact[findMacth].setaddress("");
			contact[findMacth].setBirth("");
			contact[findMacth].setGroup("");
			count--;
		
	}

	public void showData() {
		for (int i = 0; i < 10; i++) {
			contact[i].showData();
		}
	}

}
