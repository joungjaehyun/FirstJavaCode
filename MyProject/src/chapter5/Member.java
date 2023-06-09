package chapter5;

public class Member {

	// Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고,
	// main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
	// 단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.
	// ①아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String phoneNumber;
	String major;
	String grade;
	String email;
	String birth;
	String address;

	// ②위에서 정의한 정보를 출력하는 메소드 정의
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("email : " + email);
		System.out.println("생일은 " + birth);
		System.out.println("주소는 " + address);
	}
	// ③모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의

	public Member(String name, String phoneNumber, String major, String grade, String email, String birth,
			String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, String grade, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = "입력 하지 않았습니다.";
		this.address = "입력 하지 않았습니다.";
	}

	public Member() {
		this.name = "입력 하지 않았습니다.";
		this.phoneNumber = "입력 하지 않았습니다.";
		this.major = "입력 하지 않았습니다.";
		this.grade = "입력 하지 않았습니다.";
		this.email = "입력 하지 않았습니다.";
		this.birth = "입력 하지 않았습니다.";
		this.address = "입력 하지 않았습니다.";
	}



}
