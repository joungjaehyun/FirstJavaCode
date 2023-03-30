package chapter6;

public class StudentMain {

	public static void main(String[] args) {
		//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다
		// TODO Auto-generated method stub
		Student []student = new Student[10];
		int korSum =0;
		//② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		student[0] = new Student("정재현", 80, 90, 50);
		student[1] = new Student("정재현", 60, 10, 40);
		student[2] = new Student("정재현", 50, 50, 30);
		student[3] = new Student("정재현", 80, 40, 20);
		student[4] = new Student("정재현", 70, 30, 70);
		student[5] = new Student("정재현", 90, 90, 90);
		student[6] = new Student("정재현", 20, 70, 100);
		student[7] = new Student("정재현", 30, 60, 70);
		student[8] = new Student("정재현", 80, 90, 100);
		student[9] = new Student("정재현", 80, 100, 80);
		
		//③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다
		for (Student student2 : student) {
			System.out.println(student2);
			  korSum+= student2.getKorScore();
			  
			
		
		}
		float korAvg= (float) korSum/student.length;
	
	}
	

}
