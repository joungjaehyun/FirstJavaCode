package questions.answer;

public class Answer06 {

	public static void main(String[] args) {
		
		// while 문을 이용해서 1부터 9까지의 합을 구하는 프로그램을 작성.
		
		int num = 1;
		int sum = 0; // 합을 저장하는 변수
		
		while (num < 100) {
			// 반복 처리하는 문장 : 합을 구하는 연산
		
			// sum= sum + num;
			sum += num;
			
			
			System.out.println("num : " + num + "\t" + "sum : " + sum );
			num++;
		}
		System.out.println("1~99 까지의 합 : " + sum);
		
		sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
			System.out.println(i);
			
		}
	}
}
