package chapter11;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		// 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 
		HashMap<Integer, FootballPlayer> player = new HashMap<>();
		FootballPlayer play = new FootballPlayer("손흥민", 10, "토트넘", 30);
		FootballPlayer play2 = new FootballPlayer("이강인", 18, "마요르카", 20);
		FootballPlayer play3 = new FootballPlayer("박지성", 9, "맨유", 44);
		FootballPlayer play4 = new FootballPlayer("차범근", 7, "레버쿠젠", 65);
		
		player.put(play.getNumber(), play);
		player.put(play2.getNumber(), play2);
		player.put(play3.getNumber(), play3);
		player.put(play4.getNumber(), play4);
		
		Set<Integer> keyValue = player.keySet();
		for(Integer p :keyValue) {
			System.out.println(player.get(p));
		}
	}

}
