package chapter11;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
	//Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	public static void main(String[] args) {
	
		Set<FootballPlayer> myPlayer = new HashSet<>();
		//hashset에 저장하는 4개의 값을 입력 
		myPlayer.add(new FootballPlayer("손흥민", 10, "토트넘", 30));
		myPlayer.add(new FootballPlayer("손흥민", 10, "토트넘", 31));
		myPlayer.add(new FootballPlayer("이강인", 9, "토트넘", 20));
		myPlayer.add(new FootballPlayer("차두리", 8, "토트넘", 20));
		
		//myPlayer에 4개의 값이 들어갔는지 아닌지 확인
		System.out.println(myPlayer.size());
		
		for(FootballPlayer player: myPlayer) {
			System.out.println(player);
		}
		
		
				
	}
	
}
