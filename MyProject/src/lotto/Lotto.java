package lotto;

public class Lotto {


		public static void main(String[] args) {
			// 특정 범위의 난수 추출
			//int num =  (int)(Math.random() *10)+1; 
			// 0~0.99999999 -> 0~9.99999999999 -> 0~9 -> 1~10
			//System.out.println(num);
			int [] lotto = new int[7];
			
				for (int i = 0; i < lotto.length; i++) {
				lotto[i] =  (int)(Math.random() *45)+1; 
				
				for (int j = 0; j < i; j++) {
					
					if (lotto[i]==lotto[j]) {
						i--;
					}
				}
			
				System.out.println(lotto[i]);
				}
		

	}

}
