package chapter1;

public class Member {

	public static void main(String[] args) {
		// Member 클래스를 생성하고, main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다. 
		System.out.println("정재현");
		// 2챕터 1번 string
		String name;
		// 2챕터  int
		int age;
		// 2챕터 double
		double height;
		// 2챕터 boolean
		boolean hasBook;
		name = "정재현";
		age = 34;
		height = 173.5;
		hasBook = true;
		System.out.printf("%s %d %.1f %b \n",name, age, height, hasBook);
		System.out.println(name  +" " + age +" " + height + hasBook);
	
		
		
	}

}
