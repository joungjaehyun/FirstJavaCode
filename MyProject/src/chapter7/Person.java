package chapter7;

public class Person {

	private String name;
	private String id;
	

	public Person() {
		
	}

	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	 void hello() {
		int age = 0;
		int year1=0;
		int checking;
		int year2= Integer.valueOf(id.substring(0, 2));
		checking= Character.getNumericValue(id.charAt(7));
		if (checking == 1 || checking== 2) {
			year1=1900 + year2 ;
		} else if (checking == 3 || checking == 4) {
			year1=2000 + year2;
			
		}
		age = 2023 - year1;
		
		System.out.print("안녕하세요. 저는 " + name + "입니다." + " " + age +"살 입니다." );
		
	}
}
