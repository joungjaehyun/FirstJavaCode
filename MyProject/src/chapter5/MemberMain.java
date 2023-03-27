package chapter5;

public class MemberMain {
	public static void main(String[] args) {
		
		// ④main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
		
		Member mb = new Member("정재현", "010-3093-2683", "컴퓨터프로그래밍", "3학년", "krige@naver.com", "90년 10월 8일", "서울시 노원구");
	
		Member mb2 =  new Member("정재현", "010-3093-2683", "컴퓨터프로그래밍", "3학년", "krige@naver.com"); 
		
		mb.showData();
		System.out.println();
		mb2.showData();
	}
}
