package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMain {
	public static void main(String[] args) {
		
		//1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		// 저장할 크기 값 초기화 및 add를위한 FootballPlayer null로 초기화
		int countNumber = 0;
		FootballPlayer player = null;
		//List players를 ArrayList로 선언및 초기화
		List <FootballPlayer> players = new ArrayList<FootballPlayer>();
		//사용자의 입력값을 받아 ArrayList size조정
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 사람 수를 넣어주세요. 안넣는다면 초기값은 5입니다. >>");
		String count =sc.nextLine();
		if (count.equals("")) {
			countNumber =5;
		}else {
			countNumber = Integer.valueOf(count);
		}
		// ArrayList size를 조정후 사용자의 입력을 받아 ArrayList에 FootballPlayer추가
		for(int i= 0; i<countNumber; i++) {
		System.out.println("이름을 입력해 주세요>>");
		String name = sc.nextLine();
	
		System.out.println("백넘버를 입력해 주세요>>");
		int num = sc.nextInt();
		sc.nextLine();			
		System.out.println("팀을 입력해 주세요");
		String team = sc.nextLine();
		System.out.println("나이를 입력해 주세요");
		int age = sc.nextInt();
		sc.nextLine();
		player = new FootballPlayer(name,num,team,age);
		players.add(i,player);
	
		}
		// ArrayList 값에 중복값이 있는지 확인 equals는 object클래스 equals를 오버라이딩
		// 만약 중복값이 나온다면 그 값을 ArrayList 에서 제거
		System.out.println("중복값을 제거합니다");
		for (int j = 0; j < countNumber; j++) {
			for (int k = 0; k < j; k++) {
				if (players.get(j).equals(players.get(k))) {
					System.out.println("중복값이 있습니다.");
					
					players.remove(j);
				}
			}
		}
		
		
		// ArrayList 값을 출력 및 입력값 받는것을 닫음
		System.out.println("----------------------");
		for (FootballPlayer footballPlayer : players) {
			System.out.println(footballPlayer.toString());
		}
		sc.close();

	}

}
