// 매개변수가 있고, 리턴타입이 없는 함수형 인터페이스 MyFun02 를 활용한 람다식 예제

public class MyFunExample02 {
	public static void main(String[] args) {
		
		MyFun02 fi;
		
		fi = (x) -> {
			int result = 10 * x;
			System.out.println("10 x " + x + " = " + result);
		};
		
		fi.method(10);
		
		fi = (a) -> {
			System.out.println("5 + " + a + " = " + (5+a));
		};
		fi.method(5);
		
		fi = x -> System.err.println("2 x " + x + " = " + (2*x)); // 매개변수가 하나인 경우 () 생략가능
		fi.method(5);
		
	}
}
