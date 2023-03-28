package object;

public class Contact {
	
	// 변수들의 캡슐화 처리
	private String name;
	private int phoneNumber;
	private String email;
	private String address;
	private int birth;
	private String group;
	
	// 데이터를 초기화하는 생성자
	public Contact() {
		name = "";
		phoneNumber = 0;
		email = "";
		address = "";
		birth = 0;
		group = "";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void showData() {
		System.out.println("이름 "  + name);
		System.out.println("번호 "  + phoneNumber);
		System.out.println("이메일 "  + email);
		System.out.println("주소 " + address);
		System.out.println("생일 " + birth);
		System.out.println("그룹 " + group);
	}
	
}