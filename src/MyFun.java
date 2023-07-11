// 매개 변수 와 리턴타입이 없는 함수형 인터페이스 정의
// @FunctionalInterface 특징)
// 1. 자바 8 부터는 @FunctionalInterface를 사용해서 함수형 인터페이스를 정의할 수 있다.
// 2. 함수형 인터페이스에는 오직 추상메서드가 하나만 올 수 있고, 하나의 추상메서드는 꼭 정의해야 한다.
// 3. 함수형 인터페이스는 람다식 티켓 타입으로 사용하기 위한 인터페이스 이다. 즉 함수형 인터페이스는 람다식을 위한 인터페이스 이다.
// 추상메소드를 둘 이상 정의하면 컴파일 에러가 발생한다.


@FunctionalInterface
public interface MyFun {
	public void method();
	// abstract 가 생략된 추상메서드
}
