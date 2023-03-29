package chapte6;

public class Score {
	
	public static void main(String[] args) {
		//1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
		// 3행 10열 짜리 2차원 배열
		int[][]score =  {
				{100,90,80}, {70,80,90},{50,100,100},
				{80,80,90},
				{50,80,90},
				{70,60,90},{70,80,50},{70,80,40},{70,80,30},{70,80,10}
				
		};
		

		
		//평균 점수를 출력하는 프로그램을 작성해봅시다.

		int sum =0;
 		
 		float avg =0.0f;
 	
		for (int i = 0; i < score.length; i++) {
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j]);
				
			 sum = sum + score[i][j];
			 avg = (float) sum/score[i].length;
			}
			System.out.println("학생별 총합 " +sum);
			System.out.println("학생별 평균 " + avg);
			sum=0;
			avg=0.0f;
		}

	}

	
	
}
