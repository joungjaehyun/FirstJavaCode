package chapter4;
import java.time.LocalDate;
public class Member {


	 
	public static void main(String[] args) {

		int age = checkAge(1990);
		
		if (age<15 || age>=65) {
			System.out.println("무료예방접종이 가능합니다.");
		}
		else 
		{
			System.out.println("무료접종 대상이 아닙니다.");
		}

	
	
		if (age >= 20) {
			System.out.println("무료로 2년마다 건강 검진 가능");
			if (age >= 40) {
				System.out.println("40세 이상은 암검사도 무료로 가능");
			}
		}
		if (age % 2 == 0) {
			System.out.println("올해 무료 건강검진 대상입니다.");
		} else {
			System.out.println("올해 무료 건강검진 대상이 아닙니다.");
		}
	}
	
	
	
	//태어난 해를 매개변수로 받고, 그값을 int타입으로 리턴하는 checkAge함수 정의
	
	static int checkAge (int birthYear) {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		
		return year-birthYear;
		
	}
	
}
