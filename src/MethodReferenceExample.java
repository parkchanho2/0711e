import java.util.function.IntBinaryOperator;

// 인스턴스 메소드 참조와 정적 메소드 참조에 관한 실습

public class MethodReferenceExample {
	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		// IntBinaryOperator 함수형 인터페이스 특징
		// 1. 매개값이 2개이면서 반환값은 int 이다.
		// 2. applyAsInt(int left, int right); 추상메소드가 정의 되어 있음
		
		operator = (a,b) -> Calculator.staticMethod(a, b);
		System.out.println("결과 1: " + operator.applyAsInt(1, 2));
		
		// 위의 람다식을 정적메소드 참조로 변경
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		Calculator ob = new Calculator();
		operator = (x,y) -> ob.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 5));
		
		// 인스턴스 메소드 참조로 변경
		operator = ob::instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(10, 10));
	}
}
