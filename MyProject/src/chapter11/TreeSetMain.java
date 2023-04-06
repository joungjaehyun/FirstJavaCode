package chapter11;

import java.util.TreeSet;

public class TreeSetMain {

	//main에 넣어보고 출력
	public static void main(String[] args) {
		TreeSet<FootballPlayer> player = new TreeSet<>();
		player.add(new FootballPlayer("손흥민", 10, "토트넘", 30));
		player.add(new FootballPlayer("박지성", 15, "토트넘", 40));
		player.add(new FootballPlayer("손흥민", 9, "토트넘", 25));
		
		for(FootballPlayer p : player) {
			System.out.println(p);
		}
	}

}
