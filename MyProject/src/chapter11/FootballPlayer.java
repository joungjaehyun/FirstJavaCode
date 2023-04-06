package chapter11;


public class FootballPlayer implements Comparable<FootballPlayer> {



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
	// Chapter 11-2
	// Set<E> 컬렉션을 이용해서 => hashCode override 
	//이름의 마지막 인덱스 값으로 hashcode 반환
	
	@Override
	public int hashCode() {
		
		return this.name.charAt(name.length()-1);
	}
	// TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, => comparable 인터페이스 implements
	// 같은 팀의 선수들은 이름 순으로 정렬하고, 
	// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다 ==> compareTo함수 오버라이딩
	
	@Override
	public int compareTo(FootballPlayer o) {
		
		int returnNum =0;
		if (this.team.compareTo(o.getTeam()) >0) {
			returnNum =1;
		}else if (this.team.compareTo(o.getTeam()) <0) {
			returnNum = -1;
		}else {
			if (this.name.compareTo(o.getName())>0) {
				returnNum = 1;
			}else if (this.name.compareTo(o.getName())<0) {
				returnNum = -1;
			}else {
				if (this.number>o.getNumber()) {
					returnNum = 1;
				}else {
					returnNum = -1;
				}
			}
			
			}
		
		
		
		return returnNum;
	}
	
	
	
	
	// 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 
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
		return "선수명은 " + this.name + "이고 백넘버는 " + this.number + "입니다. 나이는 " + this.age + "살 입니다. 팀은 " + this.team + " 입니다.";
	}
	
}
