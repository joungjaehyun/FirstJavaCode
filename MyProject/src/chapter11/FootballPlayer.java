package chapter11;


public class FootballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer() {
		
	}
	public FootballPlayer(String name, int number, String team, int age) {
	
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {

		FootballPlayer player =null;
		if (obj!=null && obj instanceof FootballPlayer) {
			player = (FootballPlayer) obj;
			
			
			if (team.equals(player.getTeam())&&number==player.getNumber()&&name.equals(player.getName())) {
				
				return true;
			}
		}
		
		
		
		return false;
	}
	@Override
	public String toString() {
		return "선수명은 " + this.name + "이고 백넘버는 " + this.name + "입니다. 나이는 " + this.age + "살 입니다. 팀은 " + this.team + " 입니다.";
	}
	
}
