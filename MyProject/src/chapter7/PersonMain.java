package chapter7;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("손흥민", "910102-1234567");
		Male p2 = new Male("이강인", "000101-3012131", "축구선수");
		Person p3 = new Female("황진이", "100318-4123098", "기생");
		p1.hello();
		p2.hello();
		p3.hello();
	}
}
