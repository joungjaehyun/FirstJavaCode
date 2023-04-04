package chapter9;

public class Person {
	private String name;
	private String personNumber;
	public Person(String name, String personNumber) {
		
		this.name = name;
		this.personNumber = personNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	@Override
	public boolean equals(Object obj) {
		Person a = null;
		if (obj instanceof Person ) {
		
			a = (Person) obj;
		}if (a != null && this.personNumber.equals(a.personNumber)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
	Person p1 = new Person("박지성","860101-1234567");
	Person p2 = new Person("박지성1","860101-1234567");
	System.out.println(p1.equals(p2));
}
	
}
