package chapter8;

public abstract class CalculatorAbstract implements Calculator {

	// 1. Calulator 인터페이스를 상속하는 추상 클래스를 정의해봅시다.
	@Override
	public abstract long add(long n1, long n2);

	@Override
	public abstract long substract(long n1, long n2);

	@Override
	public abstract long multiply(long n1, long n2);
	@Override
	public abstract double divide(double n1, double n2);	

}
