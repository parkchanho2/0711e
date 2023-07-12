// 람다식 코드를 더 줄인 메서드 참조에 관한 실습을 위해서 2개의 인스턴스 메소드와 정적메소드를 정의
public class Calculator {
	
	public static int staticMethod(int x, int y) {
		return x+y;
	}// 정적메소드
	
	public int instanceMethod(int x, int y) {
		return x+y;
	}// 인스턴스 메소드 
}
