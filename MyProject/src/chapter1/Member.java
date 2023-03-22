package chapter1;

public class Member {

	public static void main(String[] args) {
		// Member 클래스를 생성하고, main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다. 
		System.out.println("정재현");
		// 2챕터 1번 string 선언 및 초기화
		String name = null;
		// 2챕터  int 선언 및 초기화
		int age = 0; 
		// 2챕터 double 선언 및 초기화
		double height = 0.0;
		// 2챕터 boolean 선언 및 초기화
		boolean hasBook = false;
		name = "정재현";
		age = 34;
		height = 173.5;
		hasBook = true;
		// 출력 방식 2가지 printf 를 활용한 방법 println에서 직접 불러오는 방법
		System.out.printf("%s %d %.1f %b \n",name, age, height, hasBook);
		System.out.println(name  +" " + age +" " + height + hasBook);
	
		
		
	}

}
