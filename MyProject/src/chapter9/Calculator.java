package chapter9;


public class Calculator {
	public static void main(String[] args) {
		long sTime = System.nanoTime();
		
		for(int i=0; i<100000000; i++) {
			int sum = 0;
			sum += i;
		}
		long eTime = System.nanoTime();
		
		System.out.println("걸린 시간은 " + (eTime-sTime));
	}
}
