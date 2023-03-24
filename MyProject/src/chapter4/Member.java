package chapter4;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("검진 대상자 체크");
		System.out.println("태어난 년도를 입력하세요. >>");
		
		int year = in.nextInt();
		
		printCheckFreeVaccine(year);
		printCheckMedical(year);
	}

static void printCheckFreeVaccine (int year) {
	
	int age = 2023 - year;
	
	if (age < 15 || age >= 65) {
		System.out.println("무료예방접종이 가능합니다.");
	}else {
		System.out.println("무료접종 대상이 아닙니다.");
	}
	
}

static void printCheckMedical (int year) {
	
	int age = 2023 - year;
	
	if (age>=20 &&(2023+year)% 2== 0) {
		System.out.println("무료 검진 대상입니다.");
		if (age >= 40) {
			System.out.println("무료 암 검진 대상자 입니다.");
		}
	}else {
		System.out.println("무료 검진 대상이 아닙니다.");
	}
	}
}
	

