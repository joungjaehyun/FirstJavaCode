package chapter8;

public class CalculatorImplements extends CalculatorAbstract implements Calculator {
	
	// 2. Calulator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의해봅시다.
	@Override
	public long add(long n1, long n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		// TODO Auto-generated method stub
		return  n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 / n2;
	}

}
