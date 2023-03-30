package chapter7;

public class Male extends Person {
	
	String job;
	
	public Male(String name,String id,String job) {
		super(name,id);
		this.job = job;
	}

	

	@Override
	void hello() {
		// TODO Auto-generated method stub
		System.out.println();
		super.hello();
		System.out.println("남성입니다. 직업은 " + job);
		
	}
	
	
}
