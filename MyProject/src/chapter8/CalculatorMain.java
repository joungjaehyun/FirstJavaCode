package chapter8;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// 3. 다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에
		// 인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시다.
		
		Calculator cul = new CalculatorImplements();
		
		Scanner in = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해 주세요 >>");
		long num1 = in.nextLong();
		in.nextLine();
		System.out.println("두 번째 숫자를 입력해 주세요 >>");
		long num2 = in.nextLong();
		in.nextLine();
		System.out.println("두 수의 합은 : " + cul.add(num1, num2));
		System.out.println("두 수의 차는 : " + cul.substract(num1, num2));
		System.out.println("두 수의 곱은 : " + cul.multiply(num1, num2));
		System.out.println("두 수의 나누기는 : " + cul.divide(num1, num2));
		
	}

}
