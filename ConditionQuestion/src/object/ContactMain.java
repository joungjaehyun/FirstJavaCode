package object;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact contact = new Contact();
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요 >>");
		contact.setName(in.nextLine());
		
		System.out.println("전화번호를 입력해 주세요 >>");
		contact.setPhoneNumber(in.nextLong());
		in.nextLine();
		System.out.println("이메일을 입력해 주세요 >>");
		contact.setEmail(in.nextLine());

		System.out.println("주소를 입력해 주세요");
		contact.setaddress(in.nextLine());

		System.out.println("생일을 입력해 주세요");
		contact.setBirth(in.nextInt());
		in.nextLine();
		System.out.println("그룹을 입력해 주세요");
		contact.setGroup(in.nextLine());
		
		contact.showData();
		
		
	}

}
