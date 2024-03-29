import java.util.function.IntSupplier;

public class IntSupplierReport {
	public static void main(String[] args) {
		// IntSupplier 함수형 인터페이스의 추상메소드 getAsInt()는 매개값이 없고 정수 숫자로 반환값만 가진다.
		// Math.random() 정적 메소드를 활용해서 임의의 정해지지 않는 수를 난수라고 한다 정수 난수를 리턴받아 주사위 눈의 수를 구하는 프로그램을 만들어보자.
		// 람다식 타겟 타입문법을 활용해야 함. 1~6사이의 임의의 정해지지 않은 정수 숫자 난수를 반환 받으면 그것이 곧 임의의 주사위의 눈 의 수가 된다.
		
		IntSupplier is = () -> (int)((Math.random()*5) + 1);
		
		Thread th = new Thread(()->{
			int num = is.getAsInt();
			
			System.out.println(num);
		});
		
		Thread th2 = new Thread(()->{
			int num = is.getAsInt();
			
			System.out.println(num);
		});
		th.start();
		th2.start();
//		int num = is.getAsInt();
//		
//		System.out.println(num);
		
		
		
	}
}
