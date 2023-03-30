package chapter7;

public class Female extends Person{

	String job;
	public Female(String name, String id, String job) {
		super(name, id);
		this.job = job;
	}
	@Override
	void hello() {
		// TODO Auto-generated method stub
		super.hello();
		System.out.println("여성입니다. 직업은 " + job );
		
	}

	
	
}
