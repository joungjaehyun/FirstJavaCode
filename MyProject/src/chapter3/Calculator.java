package chapter3;
import java.util.Scanner;
public class Calculator {

	//클래스내에 각가의 조건 메소드 선언 및 정의
	
	
	void add(int add1, int add2) {

		System.out.println(add1 + add2);
	}

	void substract(int sub1, int sub2) {

		System.out.println(sub1 - sub2);
	}

	void multi(int mul1, int mul2) {
		System.out.println(mul1 * mul2);
	}

	void divide(int div1, int div2) {
		System.out.println(div1/div2);
	}
	double radiusRound(double radius) {
		
		return Math.PI * radius *2;
	}
	double radiusSquare(double radius) {
		
		return Math.PI * radius *radius;
	}
	
	
	
	public static void main(String[] args) {

		// 넓이값과 둘레값을 위한 double 타입 선언 및 초기화와  main내에서 Calculator 선언
		double square=0.0;
		double round=0.0;
		double inputNumber= 0.0;
		
		// 인풋값을 받기 위해서 사용중
		Scanner in = new Scanner(System.in);
		Calculator machine =new Calculator();
		machine.add(3, 5);
		machine.substract(5, 4);
		machine.multi(3, 5);
		machine.divide(6, 2);
		
		square = machine.radiusSquare(5.0);
		round = machine.radiusRound(5.0);
		System.out.println("Square value : " + square +" + Round value : " + round);
		//인풋 입력값을 위해 사용
		System.out.println("반지름 값을 입력하세요 >>");
		inputNumber = in.nextDouble();
		
		square = machine.radiusSquare(inputNumber);
		round = machine.radiusRound(inputNumber);
		System.out.println("Square value : " + square +" + Round value : " + round);
		
	}
}
