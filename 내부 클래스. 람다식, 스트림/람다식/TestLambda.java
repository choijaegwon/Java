package lambda;

public class TestLambda {
	public static void main(String[] args) {
		MyNumber max = (x,y) ->(x>=y) ? x: y; //람다식을 인터페이스형max변수에 대입
		System.out.println(max.getMax(10, 20)); //인터페이스형 변수로 메서드 호출
	}
}